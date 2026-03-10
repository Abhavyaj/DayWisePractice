package com.gal.dao;

import com.gal.model.EMP;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.gal.EntityManagerFactoryConnectionMain;

class EmpDaoTest {

    private static EMPDao dao;

    @BeforeAll
    static void setup() {
        EntityManagerFactoryConnectionMain.getEntityManagerFactory();
        dao = new EMPDao();
    }

    @Test
    void testGetEmp() {

        EMP emp = dao.getEmployee(7102);
        assertNotNull(emp);
        assertEquals(7102, emp.getEmpno());

        System.out.println(emp);
    }

    @Test
    void testAddEmp() {

        EMP emp = new EMP(8000, "RAHUL", "CLERK", 10000);
        dao.addEmployee(emp);

        EMP savedEmp = dao.getEmployee(8000);
        assertNotNull(savedEmp);
        assertEquals("RAHUL", savedEmp.getEname());

        System.out.println(savedEmp);
    }

    @AfterAll
    static void closeConnection() {
        EntityManagerFactoryConnectionMain.getEntityManger().close();
        EntityManagerFactoryConnectionMain.getEntityManagerFactory().close();
    }
}