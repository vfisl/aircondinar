package com.airconditionar.dao;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.airconditionar.exception.AirConditionarNotFoundException;
import com.airconditionar.exception.IdNotFoundException;
import com.airconditionar.model.AirConditionar;
@Component
public class AirConditionarDAOImpl implements IAirConditionarDao {

	@Override
	public List<AirConditionar> findAll() {
		System.out.println();
		return showAllAirConditionr();
	}

	@Override
	public List<AirConditionar> findByName(String name) throws AirConditionarNotFoundException {
		return  showAllAirConditionr().stream().filter(AirConditionr->AirConditionr.getName().equalsIgnoreCase(name))
				.collect(Collectors.toList());
	}

	@Override
	public List<AirConditionar> findByBrand(String brand) throws AirConditionarNotFoundException {
		return  showAllAirConditionr().stream().filter(AirConditionar->AirConditionar.getType().equalsIgnoreCase(brand))
				.collect(Collectors.toList());
	}

	@Override
	public List<AirConditionar> findByPrice(double price) throws AirConditionarNotFoundException {
		return  showAllAirConditionr().stream().filter(AirConditionr->AirConditionr.getPrice()>(price))
				.collect(Collectors.toList());
	}

	@Override
	public List<AirConditionar> findByType(String type) throws AirConditionarNotFoundException {
		return  showAllAirConditionr().stream().filter(policy->policy.getType().equalsIgnoreCase(type))
				.collect(Collectors.toList());
	}

	@Override
	public AirConditionar findById(int id) throws IdNotFoundException {
		return showAllAirConditionr().stream().filter(AirConditionar->AirConditionar.getId()==id)
				.findFirst()
				.get();
	}
	
	private List<AirConditionar>showAllAirConditionr(){
		return Arrays.asList(new AirConditionar("voltas","samsung",80000,"split",1),
				             new AirConditionar("bluestar","Lg",60000,"smart",8),
				             new AirConditionar("carrier","panasonic",90000,"hybrid",6));
				             
	}

	
	
}

















