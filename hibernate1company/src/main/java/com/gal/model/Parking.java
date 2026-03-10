package com.gal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="PARKING")
public class Parking {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int parkingid;
    private int floorno;
    private String slotnumber;
    @OneToOne
    @JoinColumn(name="EMPNO")
    private EMP emp;
    public Parking() {
    }

    public Parking(int parkingid,int floorno,String slotnumber) {
        this.parkingid = parkingid;
        this.floorno = floorno;
        this.slotnumber = slotnumber;
    }

    public int getParkingid() {
        return parkingid;
    }

    public EMP getEmp() {
        return emp;
    }

    public void setEmp(EMP emp) {
        this.emp = emp;
    }
}