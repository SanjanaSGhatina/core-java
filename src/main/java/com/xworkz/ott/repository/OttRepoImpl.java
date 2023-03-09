package com.xworkz.ott.repository;

import java.util.List;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.ott.entity.OttEntity;

@Repository
public class OttRepoImpl implements OttRepo {
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	
	public OttRepoImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	@Override
	public boolean save(OttEntity entity) {
		System.out.println("Running save in repository");
		EntityManager em = this.entityManagerFactory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(entity);
		et.commit();
		em.close();
		return false;
	}
		
	@Override
	public boolean update(OttEntity entity) {
		System.out.println("Running Update");

		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.merge(entity);
			transaction.commit();
			return true;
		} finally {
			manager.close();
		}
	}
	
	
	
	
	@Override
	public OttEntity findById(int id) {
		System.out.println("Find By id in Repository... " + id);
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		OttEntity feromDb = entityManager.find(OttEntity.class, id);
		entityManager.close();
		return feromDb;
	}
	
	@Override
	public List<OttEntity> findByShow(String show){
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try { 
			Query query = manager.createNamedQuery("findByShow");
			query.setParameter("cp", show);
			List<OttEntity> list = query.getResultList();
			return list;
		}
		finally {
			manager.close();
		}
		
	}
	
	@Override
	public OttEntity deleteById(int id) {
		System.out.println("Delete By Id ..... " + id);
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction transaction = manager.getTransaction();
			OttEntity entity = manager.find(OttEntity.class, id);
			if(entity!=null) {
				transaction.begin();
		         manager.remove(entity);
				transaction.commit();
				return entity;
			}			
		}
		 finally {
			 manager.close();
		 }
		
		return OttRepo.super.deleteById(id);
	}
    	
}

	
	

