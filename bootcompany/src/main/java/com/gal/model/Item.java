package com.gal.model;

import org.springframework.stereotype.Repository;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Item {
	@Id
	@Column(name="itemid")
	int itemId;

	@Column(name="name")
	String name;
	
	@Column(name="type")
	String type;

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", name=" + name + ", type=" + type + "]";
	}

	public Item(int itemId, String name, String type) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.type = type;
	}

	public Item() {
		super();
	}
	
	

}
