package com.gal.dao;


import java.util.List;

import com.gal.model.Item;
//dao then points to main entity class
public interface ItemDao {
	public Item find(int itemid);
	//public List<Item> findAll();
		
	

}

