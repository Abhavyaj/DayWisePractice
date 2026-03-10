package com.gal.dao;

import com.gal.EntityManagerFactoryConnectionMain;
import com.gal.model.ProjectManager;

import jakarta.persistence.EntityManager;

public class ProjectManagerDao {

    public ProjectManager addManager(ProjectManager manager) {

        EntityManager em = EntityManagerFactoryConnectionMain.getEntityManger();

        em.getTransaction().begin();
        em.persist(manager);
        em.getTransaction().commit();

        return manager;
    }

    public ProjectManager getManager(Long id) {

        EntityManager em = EntityManagerFactoryConnectionMain.getEntityManger();
        return em.find(ProjectManager.class, id);
    }
}