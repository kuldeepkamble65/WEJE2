package com.jspider.hibernatemanytomany.Dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class ProductDto {
	@Id
	private int id;
	private String Name;
	private double price;
	private String catagory;
	

}
