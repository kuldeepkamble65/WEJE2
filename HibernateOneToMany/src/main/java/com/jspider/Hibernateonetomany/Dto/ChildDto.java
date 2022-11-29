package com.jspider.Hibernateonetomany.Dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


import lombok.Data;

@Entity
@Data
public class ChildDto {
		@Id
		private int id;
		private String name;
		private String email;
		private int age;
		
		
}
