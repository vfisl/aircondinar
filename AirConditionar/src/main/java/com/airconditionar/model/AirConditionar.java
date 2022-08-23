package com.airconditionar.model;

import org.springframework.stereotype.Component;

@Component
public class AirConditionar {
  private String name;
  private String brand;
  private double price;
  private String type;
  private int id;
public AirConditionar() {
	super();
	// TODO Auto-generated constructor stub
}
public AirConditionar(String name, String brand, double price, String type, int id) {
	super();
	this.name = name;
	this.brand = brand;
	this.price = price;
	this.type = type;
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Override
public String toString() {
	return "AirConditionar [name=" + name + ", brand=" + brand + ", price=" + price + ", type=" + type + ", id=" + id
			+ "]";
}
   
}
