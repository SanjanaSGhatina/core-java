package com.xworkz.SoftwareEngineer.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Engineer {
	@Autowired
	@Qualifier("name")
	private String name;
	@Autowired
	@Qualifier("salary")
	private String salary;
	@Autowired
	@Qualifier("companyName")
	private String companyName;
	@Autowired
	@Qualifier("exp")
	private int exp;
	
	public Engineer() {
		
	}

	@Override
	public String toString() {
		return "Engineer [name=" + name + ", salary=" + salary + ", companyName=" + companyName + ", exp=" + exp + "]";
	}
	
	

}
