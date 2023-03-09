package com.xworkz.ott.service;
import java.util.List;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.ott.dto.OTTDTO;


public interface OttService {
	Set<ConstraintViolation<OTTDTO>> vlaidateAndSave(OTTDTO dto);
	Set<ConstraintViolation<OTTDTO>> validateAndUpdate(OTTDTO dtos);
	
	OTTDTO findById(int id);

	default List<OTTDTO> findByShow(String show){
		return null;
	}
	
	default OTTDTO deleteById(int id) {
		return null;
	}
}
