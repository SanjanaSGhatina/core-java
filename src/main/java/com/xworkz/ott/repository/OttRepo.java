package com.xworkz.ott.repository;

import java.util.Collections;
import java.util.List;

import com.xworkz.ott.entity.OttEntity;

public interface OttRepo {
	boolean save(OttEntity entity);
	
	boolean update(OttEntity entity);

	OttEntity findById(int id);
	
	default List<OttEntity> findByShow(String show){
		return Collections.emptyList();
	}
	
	default OttEntity deleteById(int id) {
		return null;
	}
	
}


