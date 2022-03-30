package com.OneToOneBi.assosiation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class BiderectionalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Student student = new Student();		
		student.setName("aakshara");
			
		Address homeaddress = new Address();
		homeaddress.setStreet("KP Road");
		homeaddress.setCity("sakri");
		homeaddress.setState("Maharashtra");
		homeaddress.setZipcode("424 002");
                            
		student.setAddress(homeaddress);		
		em.persist(student);		
		em.getTransaction().commit();

		System.out.println("Added in database.");
		em.close();
		factory.close();
	
	
	}

}
