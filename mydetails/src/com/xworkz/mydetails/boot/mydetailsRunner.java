package com.xworkz.mydetails.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.mydetails.bean.Mydetails;
import com.xworkz.mydetails.configuration.MydetailsConfiguration;

public class mydetailsRunner {
	public static void main(String arg[]) {
	ApplicationContext detail = new AnnotationConfigApplicationContext(MydetailsConfiguration.class);
	Mydetails my = detail.getBean(Mydetails.class);
	System.out.println(my);
	}

}
