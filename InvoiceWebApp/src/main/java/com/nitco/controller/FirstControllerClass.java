package com.nitco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nitco.DaoImpl.SalesPersonDaoImpl;
import com.nitco.model.SalesPerson;



@Controller
public class FirstControllerClass {

	@Autowired
	SalesPersonDaoImpl salesPersonDaoImpl;

	
			
	@RequestMapping(value = "/AddSalesPerson", method = RequestMethod.GET)
	public ModelAndView addSalesPerson(Model model) {
		salesPersonDaoImpl.addSalesPerson();
		return new ModelAndView("hello","helloString","Hello from the Thymeleaf");
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String homePage(Model model) {
		List<SalesPerson> salesPersonList = salesPersonDaoImpl.getSalesPersons();
		for(SalesPerson s:salesPersonList) {
			System.out.println(s.getFirstName());
		}
		model.addAttribute(salesPersonList);
		return "ValidatingData";

	}
}
