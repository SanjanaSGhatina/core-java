package com.xworkz.Pencil.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.xworkz.Pencil")
public class PencilConfiguration {
	public PencilConfiguration() {
		System.out.println("Created PencilConfiguration");
	}

	@Bean
	public String name() {
		String ref = new String("Dooms");
		return ref;		
	}
	@Bean
	public String type() {
		String ref = new String("Pen-Pencil");
		return ref;		
	}
	@Bean
	public int price() {
		int ref = 12;
		return ref;		
	}
	@Bean
	public String color() {
		String ref = new String("Black & White");
		return ref;		
	}
	@Bean
	public boolean sharp() {
		return true;		
	}
	@Bean
	public boolean stolen() {
		return true;		
	}
}
