package com.xworkz.newsPaper.bean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {
	private String name;
	private String type;
	@Value("7365848")
	private int number;
	@Value("VR-365848")
	private String version;
	private String company;
	private String stroke;
	
	@Autowired
	public Engine(@Qualifier("engName")String name,@Qualifier("engType") String type,@Qualifier("engCompany") String company) {
		super();
		this.name = name;
		this.type = type;
		this.company = company;
	}

	@Override
	public String toString() {
		return "Engine [name=" + name + ", type=" + type + ", number=" + number + ", version=" + version + ", company="
				+ company + ", stroke=" + stroke + "]";
	}
	
	@Value("4-Stroke")
	public void setStroke(String stroke) {
		this.stroke = stroke;
	}

}
