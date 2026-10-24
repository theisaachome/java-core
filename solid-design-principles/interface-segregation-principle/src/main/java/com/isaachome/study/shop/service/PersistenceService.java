package com.isaachome.study.shop.service;

import com.isaachome.study.shop.entity.Entity;

//common interface to be implemented by all persistence services. 
public interface PersistenceService<T extends Entity> {

	 void save(T entity);
	
	 void delete(T entity);
	
	 T findById(Long id);
	// need to remove this method from the interface due to the requirement of the interface
	// segregation principle.
//	 List<T> findByName(String name);
}
