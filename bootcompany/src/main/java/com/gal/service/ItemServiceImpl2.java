package com.gal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gal.dao.ItemRepository;
import com.gal.model.Item;
@Service
public class ItemServiceImpl2 implements ItemService {
	@Autowired
	ItemRepository repo;

	@Override
	public Item find(int itemid) {
		// TODO Auto-generated method stub
		Optional<Item> optitem=repo.findById(itemid);
		return optitem.orElseThrow();	
	}
	@Override
	@Transactional
	public List<Item> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	@Override
	@Transactional
	public void addItem(Item item) {
		// TODO Auto-generated method stub
		repo.save(item);
		
	}

	@Override
	@Transactional
	public void updateItem(Item item) {
		// TODO Auto-generated method stub
		repo.save(item);
		
	}

	@Override
	public void deleteItem(int itemid) {
		// TODO Auto-generated method stub
		repo.deleteById(itemid);
		
	}

}
