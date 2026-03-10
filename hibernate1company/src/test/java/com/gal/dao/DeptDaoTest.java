package com.gal.dao;

import com.gal.model.Dept;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.gal.EntityManagerFactoryConnectionMain;

class DeptDaoTest {

    private static DeptDao dao;

    @BeforeAll
    static void setup() {
        EntityManagerFactoryConnectionMain.getEntityManagerFactory();
        dao = new DeptDao();
    }

    @Test
    void testGetDept() {

        Dept dept = dao.getDept(10);
        assertNotNull(dept);
        assertEquals(10, dept.getDeptno());
        System.out.println(dept);
    }

    @Test
    void testAddDept() {

        Dept dept = new Dept(50, "HR", "DELHI");
        dao.addDept(dept);

        Dept savedDept = dao.getDept(50);
        assertNotNull(savedDept);
        assertEquals("HR", savedDept.getDname());

        System.out.println(savedDept);
    }

    @AfterAll
    static void closeConnection() {
        EntityManagerFactoryConnectionMain.getEntityManger().close();
        EntityManagerFactoryConnectionMain.getEntityManagerFactory().close();
    }
}