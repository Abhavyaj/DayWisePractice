package com.gal;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerFactoryProvider {
	private static EntityManagerFactory emf;
    private static EntityManager em;

    public static EntityManagerFactory getEntityManagerFactory() {
        if (emf == null || !emf.isOpen()) {
            emf = Persistence.createEntityManagerFactory("supplyproblem_pu");
        }
        return emf;
    }

    public static EntityManager getEntityManager() {
        if (emf == null) {
            getEntityManagerFactory();
        }

        if (em == null || !em.isOpen()) {
            em = emf.createEntityManager();
        }

        return em;
    }

    public static void closeConnection() {
        if (em != null && em.isOpen()) {
            em.close();
        }
        if (emf != null && emf.isOpen()) {
            emf.close();
        }
    }

}
