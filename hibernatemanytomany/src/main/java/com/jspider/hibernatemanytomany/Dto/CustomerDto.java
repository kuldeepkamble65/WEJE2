package com.jspider.hibernatemanytomany.Dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity
@Data
public class CustomerDto {
	@Id
	private int id;
	private String Name;
	private String Email;
	private long contact;
	
	@ManyToMany
	private List<ProductDto> products;
}
