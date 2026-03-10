package com.gal.dao;

import com.gal.EntityManagerFactoryConnectionMain;
import com.gal.model.Quotation;

import jakarta.persistence.EntityManager;

public class QuotationDao {

    public Quotation addQuotation(Quotation q) {

        EntityManager em = EntityManagerFactoryConnectionMain.getEntityManger();

        em.getTransaction().begin();
        em.persist(q);
        em.getTransaction().commit();

        return q;
    }

    public Quotation getQuotation(int id) {

        EntityManager em = EntityManagerFactoryConnectionMain.getEntityManger();
        return em.find(Quotation.class, id);
    }
}