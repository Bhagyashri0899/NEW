package com.unidirection.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class UnidirectionTest {
public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Student student = new Student();		
		student.setName("Bhagya");
			
		Address homeaddress = new Address();
		homeaddress.setStreet("NK Road");
		homeaddress.setCity("Dhule");
		homeaddress.setState("Maharashtra");
		homeaddress.setZipcode("424 002");
                            
		student.setAddress(homeaddress);		
		em.persist(student);		
		em.getTransaction().commit();

		System.out.println("Added one student with address to database.");
		em.close();
		factory.close();
	
	}

}
