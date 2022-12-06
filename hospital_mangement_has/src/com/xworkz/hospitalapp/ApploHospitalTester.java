package com.xworkz.hospitalapp;

import java.util.Scanner;

import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.hospital.AppoloHospital;
import com.xworkz.hospitalapp.hospital.Patient;

public class ApploHospitalTester {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
          System.out.println("Enter the size\n");
          int size = scanner.nextInt(); 
          AppoloHospital appoloHospital = new AppoloHospital(size);
          
          for(int i=0;i<size;i++) 
          {
        	  Patient patient = new Patient();  
        	  
	          System.out.println("Enter patient name  : \n");
	          patient.name=scanner.next();
	          
	          System.out.println("Enter patient age  :\n");
	          patient.age=scanner.nextInt();
	          
	          System.out.println("Enter the patient address :\n");
	          patient.address= scanner.next();
	          
	          System.out.println("Enter the Gender :\n");
	          String gen = scanner.next();
	          patient.gender = Gender.valueOf(gen);
          
	          appoloHospital.addPatient(patient); 
	          System.out.println();
          }
          appoloHospital.getAllPatient();
          scanner.close();
	}
}

// ariport = terminal[]
