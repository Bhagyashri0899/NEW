package com.cg.shopping.service;

import com.cg.shopping.entities.Employee;

public interface IEmployeeService
{
    public Employee addEmployee(Employee employee);   
    public Employee updateEmployee( Employee employee);
    public Employee searchEmployee(int id);
    public boolean deleteEmployee(int id);
}
