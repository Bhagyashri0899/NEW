package com.ManyToMany.association;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManyToManyTest {
	public static void main(String[] args) {
		   
		   EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "JPA-PU" );
		   EntityManager entitymanager = emfactory.createEntityManager( );
		   entitymanager.getTransaction( ).begin( );

		   //Create Class Entity
		   Class clas1 = new Class(0, "1st", null);
		   Class clas2 = new Class(0, "2nd", null);
		   Class clas3 = new Class(0, "3rd", null);

		   //Store Class
		   entitymanager.persist(clas1);
		   entitymanager.persist(clas2);
		   entitymanager.persist(clas3);

		   //Create Class Set1
		   Set<Class> classSet1 = new HashSet();
		   classSet1.add(clas1);
		   classSet1.add(clas2);
		   classSet1.add(clas3);

		   //Create Classs Set2
		   Set<Class> classSet2 = new HashSet();
		   classSet2.add(clas3);
		   classSet2.add(clas1);
		   classSet2.add(clas2);

		   //Create Clas Set3
		   Set<Class> classSet3 = new HashSet();
		   classSet3.add(clas2);
		   classSet3.add(clas3);
		   classSet3.add(clas1);

		   //Create Teacher Entity
		   Teacher teacher1 = new Teacher(0, "Satish","Java",classSet1);
		   Teacher teacher2 = new Teacher(0, "Krishna","Adv Java",classSet2);
		   Teacher teacher3 = new Teacher(0, "Masthanvali","DB2",classSet3);

		   //Store Teacher
		   entitymanager.persist(teacher1);
		   entitymanager.persist(teacher2);
		   entitymanager.persist(teacher3);


		   entitymanager.getTransaction( ).commit( );
		   entitymanager.close( );
		   emfactory.close( );
		   }
}
