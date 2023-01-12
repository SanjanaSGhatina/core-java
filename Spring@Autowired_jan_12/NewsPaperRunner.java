package com.xworkz.newsPaper.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.newsPaper.bean.Engine;
import com.xworkz.newsPaper.bean.Ghost;
import com.xworkz.newsPaper.bean.NewsPaper;
import com.xworkz.newsPaper.bean.Snake;
import com.xworkz.newsPaper.configuration.NewsPaperConfiguration;

public class NewsPaperRunner {

	public static void main(String[] args) {
		ApplicationContext paper = new AnnotationConfigApplicationContext(NewsPaperConfiguration.class);
		System.out.println("*****NewsPaper*****");
		NewsPaper news = paper.getBean(NewsPaper.class);
		System.out.println(news);
		
		System.out.println("*****Engine*****");
		
		Engine eng = paper.getBean(Engine.class);
		System.out.println(eng);
	
		System.out.println("*****Snake*****");
		Snake sn = paper.getBean(Snake.class);
		System.out.println(sn);
		
		System.out.println("*****Ghost*****");
		Ghost gho = paper.getBean(Ghost.class);
		System.out.println(gho);
		
	}

}
