package com.airconditionar.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.airconditionar.exception.AirConditionarNotFoundException;
import com.airconditionar.exception.IdNotFoundException;
import com.airconditionar.model.AirConditionar;

@Service
public interface IAirConditionar {
	List<AirConditionar> getAll();
	
	List<AirConditionar> getByName(String name)throws AirConditionarNotFoundException;
	List<AirConditionar> getByBrand(String brand)throws AirConditionarNotFoundException;
	List<AirConditionar> getByPrice(double price)throws AirConditionarNotFoundException;
	List<AirConditionar> getByType(String type)throws AirConditionarNotFoundException;
	AirConditionar getById(int id)throws IdNotFoundException;
	 
	
}



