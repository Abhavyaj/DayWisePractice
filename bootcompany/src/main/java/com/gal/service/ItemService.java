package com.gal.service;

import java.util.List;

import com.gal.model.Item;

public interface ItemService {
	public Item find(int itemid);
	public List<Item> findAll();
	void addItem(Item item);
	void updateItem(Item item);
	void deleteItem(int itemid);
}
