package com.xworkz.SoftwareEngineer.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.SoftwareEngineer.Configuration.SoftEngineerConfiguration;
import com.xworkz.SoftwareEngineer.bean.Engineer;

public class SoftwareEngineerRunner {
	public static void main(String arg[]) {
	ApplicationContext softengin = new AnnotationConfigApplicationContext(SoftEngineerConfiguration.class);
	Engineer eng = softengin.getBean(Engineer.class);
	System.out.println(eng);
	
	}
	

}
