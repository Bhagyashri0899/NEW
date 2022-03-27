package com.oneToOne.association;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.Arrays;
import java.util.List;
public class MainExample {
	public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("test1");
    
            EntityManager em = emf.createEntityManager();
            nativeQuery(em, "SHOW TABLES");
            nativeQuery(em, "SHOW COLUMNS from EntityA");
            nativeQuery(em, "SHOW COLUMNS from EntityB");
            emf.close();
       
    }

    public static void nativeQuery(EntityManager em, String s) {
        System.out.println("--------%n'%s'%n" + s);
        Query query = em.createNativeQuery(s);
        List list = query.getResultList();
        for (Object o : list) {
            System.out.println(Arrays.toString((Object[]) o));
        }
    }
}
