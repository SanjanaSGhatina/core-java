package com.xworkz.eraser.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.eraser.Configuration.EraserConfiguration;
import com.xworkz.eraser.bean.Eraser;

public class EraserRunner {

	public static void main(String[] args) {
		ApplicationContext erase = new AnnotationConfigApplicationContext(EraserConfiguration.class);
		Eraser era = erase.getBean(Eraser.class);
		System.out.println(era);

	}

}
