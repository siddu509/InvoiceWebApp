package com.nitco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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
		salesPersonDaoImpl.addSalesPersonToRepo();
		return new ModelAndView("hello","helloString","Added the SalesPersons to the Derby DB");
	}

	@RequestMapping(value = "/salesPersons", method = RequestMethod.GET)
	public String getListOfSalesPersons(Model model) {
		List<SalesPerson> salesPersonList = salesPersonDaoImpl.getSalesPersonsFromRepo();
		for(SalesPerson s:salesPersonList) {
			System.out.println(s.getFirstName());
		}
		model.addAttribute(salesPersonList);
		return "SalesPersonList";
	}
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String homePage() {
		return "welcome";
	}
	
	@RequestMapping(value="/SalesPersons/{invoiceNumber}")
	public String getSalesPerson(@PathVariable("invoiceNumber") String invoiceNumber, Model model) {
		//SalesPerson person = salesPersonDaoImpl.getSalesPerson(invoiceNumber);
		model.addAttribute((SalesPerson)salesPersonDaoImpl.getSalesPersonFromRepo(invoiceNumber));
		return "salesPersonSingle";
		
	}
	
	@RequestMapping(value="/delete/{invoiceNumber}")
	public void deleteSalesPerson(@PathVariable("invoiceNumber") String invoiceNumber) {
		salesPersonDaoImpl.deleteSalesPersonInRepo(invoiceNumber);
	}
	
	@RequestMapping(value="/update/{salesPerson}")
	public void updateSalesPerson(@PathVariable("salesPerson") SalesPerson salesPerson) {
		salesPersonDaoImpl.updateSalesPersonInRepo(salesPerson);
	}
}
