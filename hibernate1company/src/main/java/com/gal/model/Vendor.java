package com.gal.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="VENDOR")
public class Vendor {

    @Id
    @SequenceGenerator(name="vendor_seq_gen",sequenceName="vendor_seq",allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="vendor_seq_gen")
    private int vendorid;
    private String vendorname;
    private String vendortype;
    @Column(name="contact_info",nullable=false)
    private String contact_info;
    public Vendor() {
    }
    public Vendor(int vendorid,String vendorname) {
        this.vendorid = vendorid;
        this.vendorname = vendorname;
    }
    public Vendor(int vendorid,String vendorname,String vendortype,String contact_info) {
        this.vendorid = vendorid;
        this.vendorname = vendorname;
        this.vendortype = vendortype;
        this.contact_info = contact_info;
    }

    public String toString() {
        return vendorid + " | " + vendorname + " | " + vendortype + " | Contact: " + contact_info;
    }
}