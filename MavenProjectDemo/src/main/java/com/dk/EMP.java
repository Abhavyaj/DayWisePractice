package com.dk;

import java.util.Date;

public class EMP {
	 private int EMPNO;                                   
	 public EMP(int eMPNO, String eNAME, String jOB, Integer mGR, Date hIREDATE, Double sAL, Double cOMM,
			Integer dEPTNO) {
		super();
		EMPNO = eMPNO;
		ENAME = eNAME;
		JOB = jOB;
		MGR = mGR;
		HIREDATE = hIREDATE;
		SAL = sAL;
		COMM = cOMM;
		DEPTNO = dEPTNO;
	}
	 private String ENAME;                                          
	 private String JOB;                                                
	 private Integer MGR ;                                              
	 private Date HIREDATE ;                                        
	 private Double SAL ;                                             
	 private Double COMM ;                                              
	 private Integer DEPTNO ;
	 public int getEMPNO() {
		 return EMPNO;
	 }
	 public void setEMPNO(int eMPNO) {
		 EMPNO = eMPNO;
	 }
	 public String getENAME() {
		 return ENAME;
	 }
	 public void setENAME(String eNAME) {
		 ENAME = eNAME;
	 }
	 public String getJOB() {
		 return JOB;
	 }
	 public void setJOB(String jOB) {
		 JOB = jOB;
	 }
	 public Integer getMGR() {
		 return MGR;
	 }
	 public void setMGR(Integer mGR) {
		 MGR = mGR;
	 }
	 public Date getHIREDATE() {
		 return HIREDATE;
	 }
	 public void setHIREDATE(Date hIREDATE) {
		 HIREDATE = hIREDATE;
	 }
	 public Double getSAL() {
		 return SAL;
	 }
	 public void setSAL(Double sAL) {
		 SAL = sAL;
	 }
	 public Double getCOMM() {
		 return COMM;
	 }
	 public void setCOMM(Double cOMM) {
		 COMM = cOMM;
	 }
	 public Integer getDEPTNO() {
		 return DEPTNO;
	 }
	 public void setDEPTNO(Integer dEPTNO) {
		 DEPTNO = dEPTNO;
	 }
	 
}
