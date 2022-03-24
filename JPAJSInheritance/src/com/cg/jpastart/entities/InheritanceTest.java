package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritanceTest {
public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//create one employee
		Employee employee = new Employee();
		employee.setName("bhagyashri");
		employee.setSalary(6000);
		em.persist(employee);
		
		//create one manager
		Manager manager = new Manager();
		manager.setName("sumn");
		manager.setSalary(34000);
		manager.setDepartmentName("force");
		em.persist(manager);
				
		em.getTransaction().commit();
		
		System.out.println("Added one employee and manager to database.");
		em.close();
		factory.close();
	}
}
