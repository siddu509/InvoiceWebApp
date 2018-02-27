package com.nitco.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class SalesPerson {
	
	private String firstName;
	private String lastName;
	private String vendor;
	private int hours;
	private Date startDate;
	private Date endDate;
	@Id
	private String invoiceNumber;
	
	public SalesPerson() {
		
	}
	
	public SalesPerson(String firstName, String lastName, String vendor, int hours, Date startDate, Date endDate,
			String invoiceNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.vendor = vendor;
		this.hours = hours;
		this.startDate = startDate;
		this.endDate = endDate;
		this.invoiceNumber = invoiceNumber;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	
	

}
