package com.jspider.HibernateoneToone.Dto;

import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.OneToOne;

import lombok.Data;


@Entity
@Data
public class HusbandDto {
	@Id
	private int id;
	private String Name;
	private String Email;
	private int age;
	private long contact;
	
	//@OneToOne
	//private WifeDto wife;
}
