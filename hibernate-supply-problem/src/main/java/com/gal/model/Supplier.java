package com.gal.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Supplier {

    @Id
    int sid;
    @Override
	public String toString() {
		return "Supplier [sid=" + sid + ", sname=" + sname + ", srank=" + srank + ", city=" + city + "]";
	}
	String sname;
    double srank;
    String city;
    public Supplier() {}
    public Supplier(int sid, String sname, double srank, String city) {
        this.sid = sid;
        this.sname = sname;
        this.srank = srank;
        this.city = city;
    }
    public String getSname() {
        return sname;
    }
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public double getSrank() {
		return srank;
	}
	public void setSrank(double srank) {
		this.srank = srank;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
    
}
