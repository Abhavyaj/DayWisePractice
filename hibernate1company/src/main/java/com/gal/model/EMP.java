package com.gal.model;


import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="EMP")
public class EMP {

    @Id
    @Column(name="EMPNO")
    private int empno;

    @Column(name="ENAME")
    private String ename;

    @Column(name="JOB")
    private String job;

    @Column(name="SAL")
    private double sal;

    @Column(name="MGR")
    private Integer mgr;

    @Column(name="HIREDATE")
    private Date hiredate;

    @Column(name="COMM")
    private float comm;

    @ManyToOne
    @JoinColumn(name="DEPTNO")
    private Dept department;

    public EMP() {
    }

    public EMP(int empno,String ename,String job,double sal) {
        this.empno = empno;
        this.ename = ename;
        this.job = job;
        this.sal = sal;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public Dept getDepartment() {
        return department;
    }

    public void setDepartment(Dept department) {
        this.department = department;
    }

    public String toString() {
        return "EMP [empno=" + empno + ", ename=" + ename + ", job=" + job + ", sal=" + sal + "]";
    }
}