package com.OneToManyBi.Association;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="EMP_MASTER")
public class Employee implements Serializable{

	private static final long serialVerstionUID = 1L;
	
	@Id
	@GeneratedValue( strategy= GenerationType.AUTO ) 	

	   private int eid;
	   private String ename;
	   private double salary;

	   @ManyToOne
	   @JoinColumn(name="dept_no")
	   private Department department;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
}
