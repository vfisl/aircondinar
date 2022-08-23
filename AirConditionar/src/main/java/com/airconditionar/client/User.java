package com.airconditionar.client;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.airconditionar.exception.AirConditionarNotFoundException;
import com.airconditionar.service.AirConditionarServiceImpl;

public class User {
	public static void main(String[] args) throws AirConditionarNotFoundException {
		
	
ApplicationContext context=new AnnotationConfigApplicationContext("com.airconditionar");

               Stream.of(context.getBeanDefinitionNames()).forEach(System.out::println);
        
               AirConditionarServiceImpl airConditionarServiceImpl=context.getBean(AirConditionarServiceImpl.class);
               airConditionarServiceImpl.getAll().forEach(System.out::println);
               airConditionarServiceImpl.getByName("bluestar").forEach(System.out::println);
        
}
	
	
	
}