package com.xworkz.springSoldier.dao;

import com.xworkz.springSoldier.dto.SoldierDTO;

public class SoldierDAOImpl implements SoldierDAO {

	@Override
	public boolean save(SoldierDTO sdto) {
		// TODO Auto-generated method stub
		System.out.println(sdto +": DTO SAVING>>>");
		return true;
	}
	
	

}
