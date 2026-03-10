package com.gal.model;


import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="DEPT")
public class Dept {

    @Id
    @Column(name="DEPTNO")
    private int deptno;

    @Column(name="DNAME")
    private String dname;

    @Column(name="LOC")
    private String loc;

    @OneToMany(mappedBy="department")
    private List<EMP> employees = new ArrayList<>();

    public Dept() {
    }

    public Dept(int deptno, String dname, String loc) {
        this.deptno = deptno;
        this.dname = dname;
        this.loc = loc;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public List<EMP> getEmployees() {
        return employees;
    }

    public void setEmployees(List<EMP> employees) {
        this.employees = employees;
    }

    public String toString() {
        return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
    }
}