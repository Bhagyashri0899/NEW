package com.cg.placement.repository;

import javax.persistence.EntityManager;

import com.cg.placement.entities.Employee;

public class EmployeeRepositoryImpl  implements IEmployeeRepository 
{

	   //Step 1: Start JPA LifeCycle
	
	     //create entity manager object, and import
			private EntityManager entityManager;
			public EmployeeRepositoryImpl() 
			{
				entityManager = JPAUtil.getEntityManager();
			}
			
		//Create operation in repository/DAO
		@Override
		public Employee addEmployee(Employee employee)
		{
			entityManager.persist(employee);
			return employee;		
		}
		
		@Override
		public Employee updateEmployee(Employee employee)
		{
			entityManager.merge(employee);
			return employee ;
		}

	@Override
	public Employee searchEmployee(int id) {
		Employee employee = entityManager.find(Employee.class,id);
		return employee;
	}

	@Override
	public boolean deleteEmployee(int id) 
	{
		//need to find id of employee to remove
		Employee employee= entityManager.find(Employee.class, id);
		entityManager.remove(employee);
		return false;
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

}
