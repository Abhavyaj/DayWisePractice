package com.gal.dao;


import com.gal.EntityManagerFactoryConnectionMain;
import com.gal.model.Project;

import jakarta.persistence.EntityManager;

public class ProjectDao {

	public void addProject(Project project) {
	    EntityManager em = EntityManagerFactoryConnectionMain.getEntityManger();
	    em.getTransaction().begin();
	    em.merge(project);
	    em.getTransaction().commit();
	}

    public Project getProject(int id) {

        EntityManager em = EntityManagerFactoryConnectionMain.getEntityManger();
        return em.find(Project.class, id);
    }
}
