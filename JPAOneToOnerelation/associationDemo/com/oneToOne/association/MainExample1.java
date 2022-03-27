package com.oneToOne.association;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainExample1 {
	 public static void main(String[] args) {
	      EntityManagerFactory emf = Persistence.createEntityManagerFactory("test1");
	      EntityManager em = emf.createEntityManager();

	      EntityC entityC = new EntityC();
	      EntityD entityD = new EntityD();
	      entityD.setStringD("testString");
	      entityC.setEntityD(entityD);

	      em.getTransaction().begin();
	      em.persist(entityC);
	      em.getTransaction().commit();

	      MainExample.nativeQuery(em, "select * from EntityC");
	      MainExample.nativeQuery(em, "select * from EntityD");
	      emf.close();
	  }
}

//out put:-

/* 'select * from EntityC'
[3, 4]

---------------------------
'select * from EntityD'
[4, testString] */