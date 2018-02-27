package com.nitco.dao;

import org.springframework.data.repository.CrudRepository;

import com.nitco.model.SalesPerson;

//this extends the Spring data jpa crud repository to perform all the basic necessary operations.
//Since this is a generic type it needs two input parameters, 
//1) the entity class it is working on And 2) the data type of the primary field for that entity
public interface SalesPersonDao extends CrudRepository<SalesPerson, String> {

}
