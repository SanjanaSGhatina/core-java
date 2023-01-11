package com.xworkz.SoftwareEngineer.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.SoftwareEngineer")
public class SoftEngineerConfiguration {
	public SoftEngineerConfiguration() {
		System.out.println("Created SoftwareEngineerConfiguration");
	}
	
	@Bean
	public String name() {
		String ref = new String("Sanjana S Ghatina");
		return ref;		
	}
	
	@Bean
	public String salary() {
		String ref = new String("12LPA");
		return ref;		
	}
	
	@Bean
	public String companyName() {	
		String ref = new String("Software Private Limited");
		return ref;		
	}
	
	@Bean
	public int exp() {
		int ref = 9;
		return ref;		
	}

}
