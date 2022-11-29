package com.jspider.hibernatemanytomany.Dao;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspider.hibernatemanytomany.Dto.CustomerDto;
import com.jspider.hibernatemanytomany.Dto.ProductDto;

public class CustomerProductDao {
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	
	public static void openConnection() {
		factory = Persistence.createEntityManagerFactory("manyTomany");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
	}
	
	public static void closeConnection() {
		if(factory!= null) {
			factory.close();
		}
		if(manager != null) {
			manager.close();
		}if(transaction != null) {
			try {
				transaction.rollback();
				
			} catch (TransactionException e) {
				System.out.println("Trasaction is commited..");
			}
		}
	}
	public static void main(String[] args) {
		try {
					openConnection();
					transaction.begin();
					
					;CustomerDto customer1 = new CustomerDto();
					customer1.setId(1);
					customer1.setName("virat");
					customer1.setEmail("virat@bcci.com");
					customer1.setContact(7263925264L);
					
					CustomerDto customer2 = new CustomerDto();
					customer2.setId(2);
					customer2.setName("messi");
					customer2.setEmail("messi@fifa.com");
					customer2.setContact(1324567897L);
					
					CustomerDto customer3 = new CustomerDto();
					customer3.setId(3);
					customer3.setName("mary kom");
					customer3.setEmail("marykom@bfa.com");
					customer3.setContact(215267387L);
					
					ProductDto product1 = new ProductDto();
					product1.setId(1);
					product1.setName("Shoes");
					product1.setPrice(3000);
					product1.setCatagory("Shoes_Wear");
					manager.persist(product1);
					
					ProductDto product2 = new ProductDto();
					product2.setId(2);
					product2.setName("jarcy");
					product2.setPrice(5000);
					product2.setCatagory("clothing");
					manager.persist(product2);
					
					ProductDto product3 = new ProductDto();
					product3.setId(3);
					product3.setName("watch");
					product3.setPrice(6000);
					product3.setCatagory("Accesories");
					manager.persist(product3);
					
					List<ProductDto> products = Arrays.asList(product1, product2, product3);
					
					customer1.setProducts(products);
					manager.persist(customer1);
					
					customer2.setProducts(products);
					manager.persist(customer2);
					
					customer3.setProducts(products);
					manager.persist(customer3);
					
					transaction.commit();
			
		} finally {
			closeConnection();
		}
	}
}
