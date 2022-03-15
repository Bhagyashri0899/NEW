package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.project_1.Users;


public class App {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Users.class)
                .buildSessionFactory();

Session session = factory.getCurrentSession();
try {
// Create object of entity class type
	Users user = new Users();
//Users user = new Users( 3, "Bhagyashri","Patil","bhagya@gmail.com");

// Start transaction
session.beginTransaction();
// Perform operation
//session.save(user);
user = session.get(Users.class,5);

//Update object
user.setUsers_id(2);

// Commit the transaction 
session.getTransaction().commit();
System.out.println(user);


} finally {
session.close();
factory.close();
}
}

}
