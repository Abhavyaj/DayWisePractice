package com.gal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gal.dao.ItemDao;
import com.gal.model.Item;
//it is dependent on dao interface but it will give object of daoimpl class points to dao which contains entitymanagerfactory(
//(Autowired) in nature
//it tell you it is a service class
public class ItemServiceImpl implements ItemService {
	@Autowired
	ItemDao itemDao;
	public ItemServiceImpl(ItemDao itemDao) {
		super();
		this.itemDao = itemDao;
	}
	@Override
	public Item find(int itemid) {
		return itemDao.find(itemid);
	}
	@Override
	public List<Item> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void addItem(Item item) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateItem(Item item) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteItem(int itemid) {
		// TODO Auto-generated method stub
		
	}
	
	

}
