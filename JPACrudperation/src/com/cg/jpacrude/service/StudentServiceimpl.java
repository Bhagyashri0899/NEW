package com.cg.jpacrude.service;

import com.cg.jpacrud.entities.Student;
import com.cg.jpacrude.dao.StudentDao;
import com.cg.jpacrude.dao.StudentDaoimpl;

public class StudentServiceimpl implements StudentService {

	private StudentDao dao;
	
	public StudentServiceimpl()
	{
	dao = new StudentDaoimpl();
	}
	
	@Override
	public void addStudent(Student student) {
	dao.beginTransaction();
	dao.addStudent(student);
	dao.commitTransaction();
	}
	
	@Override
	public void updateStudent(Student student) {
	dao.beginTransaction();
	dao.updateStudent(student);
	dao.commitTransaction();
	}
	
	@Override
	public void removeStudent(Student student) {
	dao.beginTransaction();
	dao.removeStudent(student);
	dao.commitTransaction();
	}
	
	@Override
	public Student findStudentById(int id) {
	//no need of transaction, as it's an read operation
	Student student = dao.getStudentById(id);
	return student;
}
}
