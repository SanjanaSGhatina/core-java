package com.xworkz.Pencil.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.Pencil.bean.Pencil;
import com.xworkz.Pencil.configuration.PencilConfiguration;



public class PencilRunner {
	public static void main(String arg[]) {
		ApplicationContext pencileee = new AnnotationConfigApplicationContext(PencilConfiguration.class);
		Pencil pen = pencileee.getBean(Pencil.class);
		System.out.println(pen);
	}

}
