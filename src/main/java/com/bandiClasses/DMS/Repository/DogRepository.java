package com.bandiClasses.DMS.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bandiClasses.DMS.Models.Dog;

/*
 * @author Akanksha Mamidiga
 * 
 */

public interface DogRepository extends CrudRepository<Dog , Integer> {
	List<Dog> findByName(String Name);
	

}
