package com.gal.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.gal.model.Item;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Query;
@Component
public class ItemDaoImpl implements ItemDao {

	@Autowired
	EntityManagerFactory emf;
	@Override
	public Item find(int itemid) {
		EntityManager em=emf.createEntityManager();
		Item item=em.find(Item.class,itemid);
		return item;
	}
	//@Override
	/*public List<Item> findAll() {
		// TODO Auto-generated method stub
		EntityManager em=emf.createEntityManager();
		Query query=em.createQuery("from Item");
		List<Item> list=query.getResultList();
		return list;*/
	

}
