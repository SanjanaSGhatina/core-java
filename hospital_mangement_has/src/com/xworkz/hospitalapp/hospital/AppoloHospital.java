package com.xworkz.hospitalapp.hospital;

public class AppoloHospital extends Hospital {
	
	
	public Patient[] patients;
    public int index ;
	
	public AppoloHospital(int size) {
		  patients = new Patient[size];
	}
	
	
	public boolean addPatient(Patient patient){
		boolean isPatientAdded = false;
		if(patient != null ) {
				System.out.println("Patient's details are Right go....\n ");
				patients[index++] = patient;
				isPatientAdded= true;
		}
				return isPatientAdded;
	}
	
	public void getAllPatient() {
		for(int i=0;i<patients.length;i++) {
		  System.out.println("Patient name : " +patients[i].name+"\n Patient address : "+patients[i].address +"\n patient age : "+patients[i].age+ "\nGender : "+patients[i].gender  );
		}
	}

}
