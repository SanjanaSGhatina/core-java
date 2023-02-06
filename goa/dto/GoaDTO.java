package com.xworkz.goa.dto;

import lombok.Data;

@Data
public class GoaDTO {
	
	public String name;
	public String Cruise;
	public double entryFee;
	public boolean freeFood;
	public boolean freeAlcohol;
	

	
	@Override
	public String toString() {
		return "GoaDTO [name=" + name + ", Cruise=" + Cruise + ", entryFee=" + entryFee + ", freeFood=" + freeFood
				+ ", freeAlcohol=" + freeAlcohol + "]";
	}
	
	

}
