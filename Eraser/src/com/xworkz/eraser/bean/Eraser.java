package com.xworkz.eraser.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Eraser {
	@Autowired
	@Qualifier("name")
	private String name;
	@Autowired
	@Qualifier("type")
	private String type;
	@Autowired
	@Qualifier("price")
	private int price;
	@Autowired
	@Qualifier("color")
	private String color;
	@Autowired
	@Qualifier("sharp")
	private boolean sharp;
	@Autowired
	@Qualifier("stolen")
	private boolean stolen;
	@Autowired
	@Qualifier("size")
	private int size;
	
	
	public Eraser() {
		System.out.println("*************");
		
	}


	@Override
	public String toString() {
		return "Eraser [name=" + name + ", type=" + type + ", price=" + price + ", color=" + color + ", sharp=" + sharp
				+ ", stolen=" + stolen + ", size=" + size + "]";
	}

	

}
