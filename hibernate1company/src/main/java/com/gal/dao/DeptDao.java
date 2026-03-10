package com.gal.dao;

import com.gal.EntityManagerFactoryConnectionMain;
import com.gal.model.Dept;

import jakarta.persistence.EntityManager;

public class DeptDao {
    public Dept getDept(int deptno) {
        EntityManager em = EntityManagerFactoryConnectionMain.getEntityManger();
        return em.find(Dept.class, deptno);
    }
    public Dept addDept(Dept dept) {
        EntityManager em = EntityManagerFactoryConnectionMain.getEntityManger();
        em.getTransaction().begin();
        em.persist(dept);
        em.getTransaction().commit();
        return dept;
    }
}