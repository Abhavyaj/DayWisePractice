package com.gal.main;

import com.gal.model.Batch;
import com.gal.model.TopicTeaching;
import com.gal.model.Trainee;
import com.gal.model.Trainer;

import jakarta.persistence.EntityManager;

public class MainTrainingApp {
	public static void main (String[] args) {
		try {
			EntityManager em = EntityManagerFactoryProvider.getEntityManager();
			em.getTransaction().begin();
			Trainee t1 = new Trainee("Harshita", "Galgotia University","harshita@gmail.com","9994599544");
			Trainee t2 = new Trainee("Harshit", "Galgotia University","harshit@gmail.com","9874678933");
			em.persist(t1);	
			em.persist(t2);
			Trainer tr1 = new Trainer("Dinesh Kumar", "TestYantra", "Java, DBMS");
			Trainer tr2 = new Trainer("Sanjay Kumar", "TestYantra", "comm skills, DBMS");
			em.persist(tr1);
			em.persist(tr2);
			Batch b1 = new Batch("Gal-batch1", "java","Gal Univ", null );				
			Batch b2 = new Batch("Gal-batch1", "java","Gal Univ", null);
			em.persist(b1);
			em.persist(b2);
			t1.setBatch(b1);
			t2.setBatch(b2);
			TopicTeaching top1 = new TopicTeaching(tr1, b1, "sql, comm ski");
			TopicTeaching top2 = new TopicTeaching(tr2, b2, "Java Sql");
			em.persist(top1);
			em.persist(top2);
			System.out.println(t1);
			System.out.println(t2);
			System.out.println(tr1);
			System.out.println(tr2);
			System.out.println(b1);
			System.out.println(b2);
			System.out.println(top1);
			System.out.println(top2);
			em.getTransaction().commit();
		}
catch(Exception e) {
			e.printStackTrace();
}
finally {

			EntityManagerFactoryProvider.closeConnection();
		}
	

}}
