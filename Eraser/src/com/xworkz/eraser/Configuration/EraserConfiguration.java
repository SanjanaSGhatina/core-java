package com.xworkz.eraser.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.Eraser")
public class EraserConfiguration {
	public EraserConfiguration(){
		System.out.println("Created EraserConfiguration");
	}
	
	@Bean
	public String name() {
		String ref = new String("Apsara");
		return ref;		
	}

	@Bean
	public String type() {
		String ref = new String("Long Eraser");
		return ref;		
	}
	@Bean
	public int price() {
		int ref = 15;
		return ref;		
	}
	@Bean
	public String color() {
		String ref = new String("White");
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
	@Bean
	public int size() {
		int ref = 5;
		return ref;		
	}
}
