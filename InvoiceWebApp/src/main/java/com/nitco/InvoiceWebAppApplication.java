package com.nitco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.nitco.controller","com.nitco.dao","com.nitco.DaoImpl","com.nitco.model"})
public class InvoiceWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvoiceWebAppApplication.class, args);
	}
}
