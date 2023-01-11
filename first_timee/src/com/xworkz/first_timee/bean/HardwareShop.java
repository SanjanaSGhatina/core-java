package com.xworkz.first_timee.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HardwareShop {
	@Autowired
	@Qualifier("id")
	private int id;
	@Autowired
	@Qualifier("name")
	private String name;
	@Autowired
	@Qualifier("gstNo")
	private String GSTNo;
	@Autowired
	@Qualifier("ownerName")
	private String ownerName;
	@Autowired
	@Qualifier("address")
	private String address;
	
	public HardwareShop() {
		System.out.println("Registering Hardware.....");
	}

	@Override
	public String toString() {
		return "HardwareShop [id=" + id + ", name=" + name + ", GSTNo=" + GSTNo + ", ownerName=" + ownerName
				+ ", address=" + address + "]";
	}

		

}
