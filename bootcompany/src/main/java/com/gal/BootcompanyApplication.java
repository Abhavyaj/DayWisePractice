package com.gal;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.gal.dao.ItemDao;
import com.gal.model.Item;
import com.gal.service.ItemService;


@SpringBootApplication
public class BootcompanyApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context=SpringApplication.run(BootcompanyApplication.class, args);
		/*ItemDao dao=context.getBean(ItemDao.class);
		Item item=dao.find(1);
		System.out.println(item);*/
		ItemService itemservice=context.getBean(ItemService.class);
		System.out.println("Find an element:");
		Item item= itemservice.find(1);
		System.out.println(item);
		System.out.println("Print all element:");
		itemservice.findAll().forEach(System.out::println);
		System.out.println("Add an element:");
		itemservice.addItem(new Item(4,"Chips","Veg"));
		itemservice.findAll().forEach(System.out::println);
		System.out.println("Update an element:");
		itemservice.updateItem(new Item(4,"Choclate","Veg"));
		itemservice.findAll().forEach(System.out::println);
		System.out.println("Delete an element:");
		itemservice.deleteItem(4);
		itemservice.findAll().forEach(System.out::println);
		
    }
		
}


