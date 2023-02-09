package com.xworkz.task.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.task")
public class DispConfiguration {
	public DispConfiguration() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

}
