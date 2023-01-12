package com.xworkz.newsPaper.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.newsPaper")
public class NewsPaperConfiguration {
	public NewsPaperConfiguration() {
		System.out.println("created Configuration");
	}
    //****NewsPaper****
	@Bean
	public String name() {
		return "ddd";
	}
	
	@Bean
	public String ownerName() {
		return "srgf";
	}
	
	
	//****Engine****
	
	@Bean
	public String engName() {
		return "Rotary Engine";
	}
	
	@Bean
	public String engType() {
		return "Diesel Type";
	}
	@Bean
	public String engCompany() {
		return "Golden Rock Railway Workshop";
	}
	
	
	//****Snakes****
	@Bean
	public String snakeName()
	{
		return "Indian Cobra";
	}
	@Bean
	public String snakeType() {
		return "Dengerous";
	}
	@Bean
	public boolean snakepois() {
		return true;
	}
	
	//****Ghost****
	@Bean
	public String ghName() {
		return "Kolli Devva";
	}
	@Bean
	public String ghType() {
		return "Anthar Pichachi";
	}
	@Bean
	public LocalDate ghdate() {
		return LocalDate.of(2020, 3, 24);
	}
	@Bean
	public String ghGender() {
		return "Do no Disclose";
	}
	@Bean
	public String ghColor() {
		return "White Ghost";
	}
	@Bean
	public String ghHair() {
		return "Ghost has white long hair";
	}
	@Bean
	public boolean ghZombi() {
		return true;
	}
	
	@Bean
	public String ghitSing() {
		return "Ghost sing a Song";
	}
	@Bean
	public String ghSaree() {
		return "Ghost wear a white Saree";
	}
	@Bean
	public boolean ghDang() {
		return true;
	}
	
}
