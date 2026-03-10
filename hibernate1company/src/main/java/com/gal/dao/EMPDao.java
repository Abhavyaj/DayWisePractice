package com.gal.dao;

import com.gal.EntityManagerFactoryConnectionMain;
import com.gal.model.EMP;

import jakarta.persistence.EntityManager;

public class EMPDao {

    public EMP getEmployee(int empno) {
        EntityManager em = EntityManagerFactoryConnectionMain.getEntityManger();
        return em.find(EMP.class, empno);
    }

    public EMP addEmployee(EMP emp) {
        EntityManager em = EntityManagerFactoryConnectionMain.getEntityManger();

        em.getTransaction().begin();
        em.persist(emp);
        em.getTransaction().commit();

        return emp;
    }

    public EMP updateEmployee(EMP emp) {
        EntityManager em = EntityManagerFactoryConnectionMain.getEntityManger();

        em.getTransaction().begin();
        EMP updated = em.merge(emp);
        em.getTransaction().commit();

        return updated;
    }
}