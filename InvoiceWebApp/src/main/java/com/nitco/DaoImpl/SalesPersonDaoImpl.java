package com.nitco.DaoImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nitco.dao.SalesPersonDao;
import com.nitco.model.SalesPerson;

@Service
public class SalesPersonDaoImpl {

	@Autowired
	private SalesPersonDao salesPersonDaoRepo;

	private Date date;

	private List<SalesPerson> salesPerson = Arrays.asList(
			new SalesPerson("AARON", "COLLINS", "SOFTHQ", 168, date, date, "AARCOL12312017"),
			new SalesPerson("JUSTIN", "DANIEL", "NHRG", 168, date, date, "JUSDAN12312017"));

	public List<SalesPerson> getSalesPersonsFromRepo() {
		List<SalesPerson> listOfSalesPerson = new ArrayList<>();
		salesPersonDaoRepo.findAll().forEach(listOfSalesPerson::add);
		return listOfSalesPerson;
	}

	public void addSalesPersonToRepo() {
		salesPersonDaoRepo.save(salesPerson);
	}

	public SalesPerson getSalesPersonFromRepo(String invoiceNumber) {
		return salesPersonDaoRepo.findOne(invoiceNumber);

	}
	
	public void deleteSalesPersonInRepo(String invoiceNumber) {
		salesPersonDaoRepo.delete(invoiceNumber);
	}
	
	public void updateSalesPersonInRepo(SalesPerson salesPersonRepo) {
		salesPersonDaoRepo.save(salesPersonRepo);
	}

}
