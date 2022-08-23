package com.airconditionar.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.airconditionar.dao.IAirConditionarDao;
import com.airconditionar.exception.AirConditionarNotFoundException;
import com.airconditionar.exception.IdNotFoundException;
import com.airconditionar.model.AirConditionar;


@Component
public class AirConditionarServiceImpl implements IAirConditionar {
	@Autowired
 IAirConditionarDao airConditionarDao;
  
	@Override
	public List<AirConditionar> getAll() {
		List<AirConditionar> airConditionars=airConditionarDao.findAll();
		
		return airConditionars;
		
	}

	@Override
	public List<AirConditionar> getByName(String name) throws AirConditionarNotFoundException {
		List<AirConditionar>aircondi=airConditionarDao.findByName(name);
				
	
		return aircondi;
	}
	

	@Override
	public List<AirConditionar> getByBrand(String brand) throws AirConditionarNotFoundException {
		List<AirConditionar>aircondi=airConditionarDao
				.findByBrand(brand)
				.stream()
				.sorted((a1,a2)->a1.getName().compareTo(a2.getName()))
				.collect(Collectors.toList());
		if(aircondi.isEmpty())
		{
			throw new AirConditionarNotFoundException("airconditioner not found");
		}
		return aircondi;
	}

	@Override
	public List<AirConditionar> getByPrice(double price) throws AirConditionarNotFoundException {
		List<AirConditionar>aircondi=airConditionarDao
				.findByPrice(price)
				.stream()
				.sorted((a1,a2)->a1.getName().compareTo(a2.getName()))
				.collect(Collectors.toList());
		if(aircondi.isEmpty())
		{
			throw new AirConditionarNotFoundException("airconditioner not found");
		}
		return aircondi;
	}

	@Override
	public List<AirConditionar> getByType(String type) throws AirConditionarNotFoundException {
		List<AirConditionar>aircondi=airConditionarDao
				.findByType(type)
				.stream()
				.sorted((a1,a2)->a1.getName().compareTo(a2.getName()))
				.collect(Collectors.toList());
		if(aircondi.isEmpty())
		{
			throw new AirConditionarNotFoundException("airconditoner not found");
		}
		return aircondi;
	}
	

	@Override
	public AirConditionar getById(int id) throws IdNotFoundException {
		AirConditionar airConditionar=airConditionarDao.findById(id);
		if(airConditionar !=null) {
			return airConditionar;
		}
		throw new IdNotFoundException("id not found");
	}

	

	
}
