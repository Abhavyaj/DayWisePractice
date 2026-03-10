package com.gal.dao;

import com.gal.EntityManagerFactoryConnectionMain;
import com.gal.model.Item;

import jakarta.persistence.EntityManager;

public class ItemDao {

    public Item addItem(Item item) {
        EntityManager em = EntityManagerFactoryConnectionMain.getEntityManger();

        em.getTransaction().begin();
        em.persist(item);
        em.getTransaction().commit();

        return item;
    }

    public Item getItem(int id) {
        EntityManager em = EntityManagerFactoryConnectionMain.getEntityManger();
        return em.find(Item.class, id);
    }
}