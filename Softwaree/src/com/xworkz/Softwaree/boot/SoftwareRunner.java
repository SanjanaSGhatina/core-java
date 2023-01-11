package com.xworkz.Softwaree.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.Softwaree.bean.Software;
import com.xworkz.Softwaree.configuration.SoftwareConfiguration;



public class SoftwareRunner {

	public static void main(String[] args) {
		ApplicationContext soft = new AnnotationConfigApplicationContext(SoftwareConfiguration.class);
		Software sef=soft.getBean(Software.class);
		System.out.println(sef);

	}

}
