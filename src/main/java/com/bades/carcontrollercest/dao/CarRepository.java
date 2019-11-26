package com.bades.carcontrollercest.dao;

import com.bades.carcontrollercest.entity.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Long>{
	
}
