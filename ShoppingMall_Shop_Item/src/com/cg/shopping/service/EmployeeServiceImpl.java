package com.cg.shopping.service;

import com.cg.shopping.entities.Employee;
import com.cg.shopping.repository.EmployeeRepositoryImpl;
import com.cg.shopping.repository.IEmployeeRepository;



public class EmployeeServiceImpl implements IEmployeeService
{

	// Step 1: Establishing connection between Service and Repo
	
				private IEmployeeRepository dao;
				
				public EmployeeServiceImpl() 
				{
					dao = new EmployeeRepositoryImpl();
				}
				
				
	
		@Override
		public Employee addEmployee( Employee employee) 
		{
			dao.beginTransaction();
			dao.addEmployee(employee);
			dao.commitTransaction();
			return employee;
		}
		
		@Override
		public Employee updateEmployee(Employee employee) 
		{
			dao.beginTransaction();
			dao.updateEmployee(employee);
			dao.commitTransaction();
			return employee;		
		}

	@Override
	public Employee searchEmployee(int id) {
		Employee employee = dao.searchEmployee(id);
		return employee;
		
	}

	@Override
	public boolean deleteEmployee(int id)
	{
		dao.beginTransaction();
		dao.deleteEmployee(id);
		dao.commitTransaction();
		
		return false;
	}
}
