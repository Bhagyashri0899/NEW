package com.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App {
public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Users.class)
                .buildSessionFactory();

Session session = factory.getCurrentSession();

    
try {
	

      //start transaction
        session.beginTransaction();
      // session.createQuery("update users set lname = 'deore' where fname = 'bhagyashri'").executeUpdate();                 //update records using HQL
       session.createQuery("delete users where email  = 'bhagy@gmail.com'").executeUpdate();                                 //update records using HQL
        
    /*   List<Users> users =  session.createQuery("frome users where lname = 'Patil'"+"AND fname ='Bhagyashri'").getResultList();     //HQL where
        List<Users> users =  session.createQuery("frome users ").getResultList();                                                     // List records
       
       
    	for(Users temp:users)
    	{
    		System.out.println(temp);
    	}
      
      //commit the transaction
   */
}
finally {
session.close();
factory.close();
}
}
}