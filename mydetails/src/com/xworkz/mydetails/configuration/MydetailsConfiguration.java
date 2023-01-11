package com.xworkz.mydetails.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.mydetails")
public class MydetailsConfiguration {
	public MydetailsConfiguration() {
		System.out.println("created MydetailsConfiguration");
	}
	
	@Bean
	public String name() {
		String ref = new String("Sanjana S");
		return ref;		
	}

	@Bean
	public byte memory() {
		return 2;		
	}
	@Bean
	public short  height() {
		return 154;		
	}
	@Bean
	public int weight() {
		return 47;		
	}
	@Bean
	public long bones() {
		return 206L;		
	}
	@Bean
	public float blootvessels() {
		return 2;		
	}
	@Bean
	public double eyes() {
		return 2;		
	}
	@Bean
	public boolean dem() {
		return false;		
	}
	@Bean
	public char gender() {
		return 'F';		
	}

}
