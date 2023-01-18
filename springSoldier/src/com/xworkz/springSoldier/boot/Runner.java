package com.xworkz.springSoldier.boot;


import com.xworkz.springSoldier.dao.SoldierDAOImpl;
import com.xworkz.springSoldier.dto.SoldierDTO;
import com.xworkz.springSoldier.service.SoldierServiceImpl;

public class Runner {
	public static void main(String[] args) {
		
		SoldierDTO dto=new SoldierDTO(1,"Sanjanas","indian","monish","Afsghatian"); 
		SoldierDTO dto1=new SoldierDTO(2,"Tjsgsh","india","monishlet","rajastan"); 
		SoldierServiceImpl service=new SoldierServiceImpl();
		SoldierDAOImpl sda=new SoldierDAOImpl();
		service.setDAO(sda);
		service.ValidateAndSave(dto);
		service.ValidateAndSave(dto1);

		
	}
	

			
		
		
	

}
