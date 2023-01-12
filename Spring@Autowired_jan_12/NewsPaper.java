package com.xworkz.newsPaper.bean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NewsPaper {
	@Value("12")
	private int id;
	private String name;
	private String ownerName;
	@Value("Kannada")
	private String lang;
	private double price;
	
	
	@Autowired
	public NewsPaper(@Qualifier("name")String name, @Qualifier("ownerName")String ownerName) {
		super();
		this.name = name;
		this.ownerName = ownerName;
	}

	
	@Override
	public String toString() {
		return "NewsPaper [id=" + id + ", name=" + name + ", ownerName=" + ownerName + ", lang=" + lang + ", price="
				+ price + "]";
	}

	@Value("12.7")
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	

}
