package com.cg.jpa.association;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	 public static void main(String[] args) {
		   
		   EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "JPA" );
		   EntityManager entitymanager = emfactory.createEntityManager( );
		   entitymanager.getTransaction( ).begin( );

		   //Create Department Entity
		   Department department = new Department();
		   department.setName("Development");

		   //Store Department
		   entitymanager.persist(department);

		   //Create Employee Entity
		   Employee employee = new Employee();
		   employee.setEname("Satish");
		   employee.setSalary(45000.0);
		   employee.setDeg("Technical Writer");
		   employee.setDepartment(department);

		   //Store Employee
		   entitymanager.persist(employee);

		   entitymanager.getTransaction().commit();
		   entitymanager.close();
		   emfactory.close();
		   }
		
}

/* out put:-
  
  department table   -    Id	 Name
                          301	 Development
----------------------------------------------------

   employee table   -   Eid   Deg	                 Ename	Salary	Department_id
                        302	  Technical Writer	     Satish	45000	301
                   */
 
