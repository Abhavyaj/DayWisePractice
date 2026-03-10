package com.gal.dao;

import com.gal.EntityManagerFactoryConnectionMain;
import com.gal.model.Vendor;

import jakarta.persistence.EntityManager;

public class VendorDao {

    public Vendor addVendor(Vendor vendor) {
        EntityManager em = EntityManagerFactoryConnectionMain.getEntityManger();

        em.getTransaction().begin();
        em.persist(vendor);
        em.getTransaction().commit();

        return vendor;
    }

    public Vendor getVendor(int id) {
        EntityManager em = EntityManagerFactoryConnectionMain.getEntityManger();
        return em.find(Vendor.class, id);
    }
}