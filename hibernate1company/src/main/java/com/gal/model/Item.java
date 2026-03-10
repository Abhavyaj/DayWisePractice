package com.gal.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ITEM")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int itemid;

    private String itemtype;

    private String itemname;

    @Column(name="cost", nullable=false)
    private double cost;

    public Item() {
    }

    public Item(String itemtype,String itemname,double cost) {
        this.itemtype = itemtype;
        this.itemname = itemname;
        this.cost = cost;
    }

    public int getItemid() {
        return itemid;
    }

    public String getItemtype() {
        return itemtype;
    }

    public String getItemname() {
        return itemname;
    }

    public double getCost() {
        return cost;
    }

    public String toString() {
        return itemid + " | " + itemtype + " | " + itemname + " | Cost: " + cost;
    }
}