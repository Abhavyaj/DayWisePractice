package com.gal.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Supply {
	@Id
	int billno;
	@ManyToOne
	@JoinColumn(name="sid")
	Supplier supplier;
    @ManyToOne
    @JoinColumn(name="itemid")
	Item item;
    Supply(){};
	public Supply(int billno, Supplier supplier, Item item, Date datesupply, Double price, int qty) {
		super();
		this.billno = billno;
		this.supplier = supplier;
		this.item = item;
		this.datesupply = datesupply;
		Price = price;
		this.qty = qty;
	}
	Date datesupply;
	Double Price;
	int qty;
	@Override
	public String toString() {
		return "Supply [billno=" + billno + ", supplier=" + supplier + ", item=" + item + ", datesupply=" + datesupply
				+ ", Price=" + Price + ", qty=" + qty + "]";
	}
	public int getBillno() {
		return billno;
	}
	public void setBillno(int billno) {
		this.billno = billno;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public Date getDatesupply() {
		return datesupply;
	}
	public void setDatesupply(Date datesupply) {
		this.datesupply = datesupply;
	}
	public Double getPrice() {
		return Price;
	}
	public void setPrice(Double price) {
		Price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	

}
