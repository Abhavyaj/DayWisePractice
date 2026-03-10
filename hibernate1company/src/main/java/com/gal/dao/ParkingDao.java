package com.gal.dao;

import com.gal.EntityManagerFactoryConnectionMain;
import com.gal.model.Parking;

import jakarta.persistence.EntityManager;

public class ParkingDao {

    public Parking addParking(Parking parking) {
        EntityManager em = EntityManagerFactoryConnectionMain.getEntityManger();

        em.getTransaction().begin();
        em.persist(parking);
        em.getTransaction().commit();

        return parking;
    }

    public Parking getParking(int id) {
        EntityManager em = EntityManagerFactoryConnectionMain.getEntityManger();
        return em.find(Parking.class, id);
    }
}