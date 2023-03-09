package com.xworkz.ott.dto;

import javax.persistence.Id;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
@Data
public class OTTDTO {
	@Id
	private int id;
	
	@Size( message = " Platform Cannot be Empty")
	  private  String platform;
	
		@Size( message = " ShoW Cannot be Empty")
	  private String show;
		
		@Size( message = " Language Cannot be Empty")
		  private String language;
		
		
		@NotNull
	  private Double cost;
		
		@NotNull
	  private Double monthlypack;
		
	

		
		
	

}
