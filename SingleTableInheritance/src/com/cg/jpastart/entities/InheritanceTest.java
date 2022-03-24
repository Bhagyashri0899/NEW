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
		employee.setName("bhagya");
		employee.setSalary(1000);
		em.persist(employee);
        
		
		//create one manager
		Manager manager = new Manager();
		manager.setName("Rohn");
		manager.setSalary(10000);
		manager.setDepartmentName("elex");
		em.persist(manager);
		
		em.getTransaction().commit();
		
		System.out.println("Added one employee and manager to database,");
		em.clear();
		factory.close();
		
		
	}

}
