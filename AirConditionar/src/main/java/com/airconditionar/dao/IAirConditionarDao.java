package com.airconditionar.dao;

import java.util.List;

import com.airconditionar.exception.AirConditionarNotFoundException;
import com.airconditionar.exception.IdNotFoundException;
import com.airconditionar.model.AirConditionar;


public interface IAirConditionarDao {
	List<AirConditionar> findAll();
	
	List<AirConditionar> findByName(String name)throws AirConditionarNotFoundException;
	List<AirConditionar>findByBrand(String brand)throws AirConditionarNotFoundException;
	List<AirConditionar> findByPrice(double price)throws AirConditionarNotFoundException;
	List<AirConditionar> findByType(String type)throws AirConditionarNotFoundException;
	AirConditionar findById(int id)throws IdNotFoundException;
	
	
	
}
