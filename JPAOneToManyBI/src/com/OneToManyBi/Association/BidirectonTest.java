package com.OneToManyBi.Association;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BidirectonTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		   
		//create a new department
		Department department = new Department();
		//department.setId(10);
		department.setName("Sales");
		
		
		Department department1 = new Department();
		//department.setId(11);
		department.setName("Marketing");
		
		
		Employee e1 = new Employee();
		//e1.setEid(1001);
		e1.setEname("priya Sharma");
		e1.setSalary(4500);
		
		
		Employee e2 = new Employee();
		//e2.setEid(1002);
		e2.setEname("Dinesh Kumar");
		e2.setSalary(4500);
		
		//add both employee to department
		department.addEmploee(e1);
		department.addEmploee(e2);
		
		//save department and its employees using entity manager
		em.persist(department);
		em.persist(department1);
		
		System.out.println("Added department along with two employees to database.");
		em.getTransaction().commit();
		em.close();
		factory.close();
	}	
}
