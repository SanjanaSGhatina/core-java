package com.xworkz.first_timee.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.first_timee.bean.HardwareShop;
import com.xworkz.first_timee.configuration.HardwareConfiguration;


public class HardwareRunner {
	
	public static void main(String arg[]) {
	ApplicationContext hardwre = new AnnotationConfigApplicationContext(HardwareConfiguration.class);
	HardwareShop hw = hardwre.getBean(HardwareShop.class);
	System.out.println(hw);
	
	
	}

}
