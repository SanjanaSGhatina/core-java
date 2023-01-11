package com.xworkz.first_timee.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.first_timee")
public class HardwareConfiguration {
	public HardwareConfiguration() {
		System.out.println("Created firstConfiguration");
	}
	
	@Bean
	public int id() {
		System.out.println("Registering id....");
		int ref = 01;
		return ref;
		
	}
	@Bean
	public String name() {
		System.out.println("Registering name....");
		String ref = new String("***S.L.V Hardware Center***");
		return ref;
	}
	@Bean
	public String gstNo() {
		System.out.println("Registering gstNo....");
		String ref = new String("GST96568u65");
		return ref;
		
	}
	@Bean
	public String ownerName() {
		System.out.println("Registering ownerName....");
		String ref = new String("Sanjana");
		return ref;
	}
	@Bean
	public String address() {
		System.out.println("Registering address....");
		String ref = new String("Shimoga");
		return ref;
	}
}
