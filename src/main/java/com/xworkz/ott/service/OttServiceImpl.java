package com.xworkz.ott.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.ott.dto.OTTDTO;
import com.xworkz.ott.entity.OttEntity;
import com.xworkz.ott.repository.OttRepo;

@Service
public class OttServiceImpl implements OttService {

	@Autowired
	public OttRepo ottRepo;

	public OttServiceImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<OTTDTO>> vlaidateAndSave(OTTDTO dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

		Validator validator = factory.getValidator();
		Set<ConstraintViolation<OTTDTO>> constraintViolations = validator.validate(dto);
		if (constraintViolations != null && !constraintViolations.isEmpty()) {
			System.err.println("constraintViolations exits, return constraintViolations");
			return constraintViolations;
		} else {
			System.out.println("constraintViolations doesn't exist data is good");

			OttEntity entity = new OttEntity();
			entity.setId(dto.getId());
			entity.setPlatform(dto.getPlatform());
			entity.setShow(dto.getShow());
			entity.setLanguage(dto.getLanguage());
			entity.setCost(dto.getCost());
			entity.setMonthlypack(dto.getMonthlypack());
			


			boolean saved = this.ottRepo.save(entity);
			System.out.println("Entity Data is saved " + saved);
			return Collections.emptySet();

		}
	}
	
	
	@Override
	public Set<ConstraintViolation<OTTDTO>> validateAndUpdate(OTTDTO dtos) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        
        Set<ConstraintViolation<OTTDTO>> violations = validator.validate(dtos);
        
        if(violations !=null && !violations.isEmpty()) {
        	System.err.println("Violations in DTO " +dtos);
        	return violations;
        }
        else
        {
        	System.out.println("constraintViolations doesn't exist data is good");

			OttEntity entity = new OttEntity();
			entity.setId(dtos.getId());
			entity.setPlatform(dtos.getPlatform());
			entity.setShow(dtos.getShow());
			entity.setLanguage(dtos.getLanguage());
			entity.setCost(dtos.getCost());
			entity.setMonthlypack(dtos.getMonthlypack());
	
			boolean saved = this.ottRepo.save(entity);
			System.out.println("Entity Data is saved " + saved);
			return Collections.emptySet();
        }
        	
        }
	
	@Override
	public OTTDTO deleteById(int id) {
		System.out.println("Running Delete By Id");
		OttEntity ent = this.ottRepo.deleteById(id);
		if(ent!= null) {
			OTTDTO dto = new OTTDTO();
			dto.setId(ent.getId());
			dto.setPlatform(ent.getPlatform());
			dto.setShow(ent.getShow());
			dto.setLanguage(ent.getLanguage());
			dto.setCost(ent.getCost());
			dto.setMonthlypack(ent.getMonthlypack());
			return dto;
		}
		else
			return OttService.super.deleteById(id);
	}

		
	@Override
	public OTTDTO findById(int id) {
		if (id > 0) {

			OttEntity entity = this.ottRepo.findById(id);
			if (entity != null) {
				System.out.println("Entity is found in service for id " + id);

				OTTDTO dto = new OTTDTO();

				dto.setId(entity.getId());
				dto.setPlatform(entity.getPlatform());
				dto.setShow(entity.getShow());
				dto.setLanguage(entity.getLanguage());
				dto.setCost(entity.getCost());
				dto.setMonthlypack(entity.getMonthlypack());
				
				
				return dto;
			}
		}
		return null;

	}

	@Override
	public List<OTTDTO> findByShow(String show){
		System.out.println("Running find by show");
		if (show != null && !show.isEmpty()) {
			System.out.println("Data is valid");
			
			List<OttEntity> ent = this.ottRepo.findByShow(show);
			
			List<OTTDTO> listDto = new ArrayList<OTTDTO>();
			
			for(OttEntity showEnt : ent) {
				OTTDTO dto = new OTTDTO();
				dto.setId(showEnt.getId());
				dto.setPlatform(showEnt.getPlatform());
				dto.setShow(showEnt.getShow());
				dto.setLanguage(showEnt.getLanguage());
				dto.setCost(showEnt.getCost());
				dto.setMonthlypack(showEnt.getMonthlypack());
				listDto.add(dto);
				
			}
			System.out.println("Size of dtos" +listDto.size());
			System.out.println("Size of entits "+ ent.size());
			return listDto;
			
		}
		else
		{
			System.err.println("Show Name is in-valid");
		}
		return OttService.super.findByShow(show);
	}
}
