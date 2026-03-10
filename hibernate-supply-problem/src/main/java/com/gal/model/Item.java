package com.gal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Item {
    @Id
    int itemid;
    String name;
    String type;
    public Item() {}
    public Item(int itemid, String name, String type) {
        this.itemid = itemid;
        this.name = name;
        this.type = type;
    }
    public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Item [itemid=" + itemid + ", name=" + name + ", type=" + type + "]";
	}
	public String getName() {
        return name;
    }
}