package com.xworkz.Softwaree.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.Softwaree")
public class SoftwareConfiguration {
		public SoftwareConfiguration() {
			System.out.println("Created firstConfiguration");
		}
		
		@Bean
		public String name() {
			System.out.println("Registering name....");
			String ref = new String("Software Private Limited");
			return ref;
		}
		
		@Bean
		public String version() {
			System.out.println("Registering version....");
			String ref = new String("V2.0");
			return ref;
		}
		
		@Bean
		public String developer() {
			System.out.println("Registering developer....");
			String ref = new String("Sanjana");
			return ref;
		}
		
		@Bean
		public LocalDate date() {
			System.out.println("Registering date....");
			return LocalDate.of(1999, 01, 9);
			
		}
		
		@Bean
		public boolean free() {
			System.out.println("Registering free....");
			return true;
		}
		

}
