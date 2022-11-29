package com.jspider.Hibernateonetomany.Dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class FatherDto {
		@Id
		private int id;
		private String Name;
		private String email;
		private int age;
		
		@OneToMany
		private List<ChildDto> children;
}
