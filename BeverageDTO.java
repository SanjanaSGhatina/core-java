package com.xworkz.task.dto;

import java.time.LocalDate;

@Deprecated
public class BeverageDTO {
	private String name;
    private int id; 
    private String quantity;
    private int price;
    private String barcodeNo;
    private String colour;
    private String flavour;
    private String type;
    private LocalDate mfdDate;
    private LocalDate expDate;
}