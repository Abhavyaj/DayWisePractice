package com.gal.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Item {

	@Id
	long itemid;

	String name, type;
	Double cost;

}
