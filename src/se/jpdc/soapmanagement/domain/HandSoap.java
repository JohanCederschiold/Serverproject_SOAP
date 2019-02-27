package se.jpdc.soapmanagement.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HandSoap implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(length=25)
	private String brand;
	
	@Column(length=25)
	private String name;
	
	private double price;
	private int weightInGrams;
	
	
	public HandSoap () {
		
	}	
	
	
	public HandSoap(String brand, String name, double price, int weightInGrams) {
		this.brand = brand;
		this.name = name;
		this.price = price;
		this.weightInGrams = weightInGrams;
	}


	@Override
	public String toString () {
		return String.format("%s of %s, weighing %d grams with at price of %.2f", 
				name, brand, weightInGrams, price);
	}



	public int getId() {
		return id;
	}

	public String getBrand() {
		return brand;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getWeightInGrams() {
		return weightInGrams;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setWeightInGrams(int weightInGrams) {
		this.weightInGrams = weightInGrams;
	}

}
