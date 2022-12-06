/**
 * 
 */
package com.xworkz.hospitalapp.hospital;

/**
 * @author DELL
 *
 */

import java.util.Enumeration;

public class Patient extends Hospital {
    public com.xworkz.hospitalapp.constant.Gender gender;
	public String name;
	public int age;
	public String address;
	 
	public Patient( ) {
		super();
//		this.name =name;
//		this.address=address;		
//	   this.gender= Gender.valueOf(Gender);
//		
//		this.age=age;
		
	}
	public void display() {
		  System.out.println("The patient name :"+ this.name);
		  System.out.println("The patient address :"+ this.address);
		  System.out.println("The patient age :"+ this.age);
	}

}
