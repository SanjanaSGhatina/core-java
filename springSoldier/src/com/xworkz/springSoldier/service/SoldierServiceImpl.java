package com.xworkz.springSoldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.springSoldier.dao.SoldierDAO;
import com.xworkz.springSoldier.dto.SoldierDTO;

public class SoldierServiceImpl implements SoldierService {
	SoldierDAO sdao;
	public void setDAO(SoldierDAO sdao)
	{
		this.sdao=sdao;
	}

	@Override
	public boolean ValidateAndSave(SoldierDTO vsdto) {
		
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator validator=factory.getValidator();
		Set<ConstraintViolation<SoldierDTO>> violations=validator.validate(vsdto);
		if(!violations.isEmpty()) {
			
			System.out.println("There are no Errors");
			violations.forEach(v->{System.out.println(" Violations: "+v.getMessage());});
			return true;
		}
		else
		{
			System.out.println("data is valid");
			boolean saved=sdao.save(vsdto);
			System.out.println("DTO SAVED USING>>>>"+saved);
			return true;
		}
		
		
		
	}

}
