package com.xworkz.newsPaper.bean;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ghost {
	private String name;
	private String type;
	private LocalDate deathDate;
	private String gender;
	private String color;
	private String whitelongHair; 
	private boolean zombi; 
	private String itsingSong;
	private String wearSaree;
	private boolean dengerous;
	
	@Value("True")
	private boolean It_fly;
	@Value("")
	private String fat;
	@Value("6.8")
	private double height;
	@Value("Monster Teeth")
	private String teeth;
	@Value("45")
	private int age;
	@Value("True")
	private boolean horrible;
	@Value("yes..It laugh")
	private String laugh;
	@Value("Manusha")
	private String religion;
	@Value("Love Failure")
	private String reason;
	@Value("Nandhi Hills")
	private String place;
	
	
	@Autowired
	public Ghost(@Qualifier("ghName")String name, @Qualifier("ghType")String type, @Qualifier("ghdate")LocalDate deathDate, @Qualifier("ghGender")String gender,@Qualifier("ghColor") String color, @Qualifier("ghHair")String whitelongHair,
			@Qualifier("ghZombi")boolean zombi,@Qualifier("ghitSing") String itsingSong, @Qualifier("ghSaree")String wearSaree, @Qualifier("ghDang")boolean dengerous) {
		super();
		this.name = name;
		this.type = type;
		this.deathDate = deathDate;
		this.gender = gender;
		this.color = color;
		this.whitelongHair = whitelongHair;
		this.zombi = zombi;
		this.itsingSong = itsingSong;
		this.wearSaree = wearSaree;
		this.dengerous = dengerous;
	}


	@Override
	public String toString() {
		return "Ghost [name=" + name + ", type=" + type + ", deathDate=" + deathDate + ", gender=" + gender + ", color="
				+ color + ", whitelongHair=" + whitelongHair + ", zombi=" + zombi + ", itsingSong=" + itsingSong
				+ ", wearSaree=" + wearSaree + ", dengerous=" + dengerous + ", It_fly=" + It_fly + ", fat=" + fat
				+ ", height=" + height + ", teeth=" + teeth + ", age=" + age + ", horrible=" + horrible + ", laugh="
				+ laugh + ", religion=" + religion + ", reason=" + reason + ", place=" + place + "]";
	}
	
	
	
	

}
