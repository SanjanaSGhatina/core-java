package com.xworkz.mydetails.bean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mydetails {
	@Autowired
		private String name;
	@Autowired
		private byte memory;
	@Autowired
		private short height;
	@Autowired
		private int weight;
	@Autowired
		private long bones;
	@Autowired
		private float bloodvessels;
	@Autowired
		private double eyes;
	@Autowired
		private boolean dem;
	@Autowired
		private char gender;
		
		public Mydetails() {
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Mydetails [name=" + name + ", memory=" + memory + ", height=" + height + ", weight=" + weight
					+ ", bones=" + bones + ", bloodvessels=" + bloodvessels + ", eyes=" + eyes + ", dem=" + dem
					+ ", gender=" + gender + "]";
		}
		

}
