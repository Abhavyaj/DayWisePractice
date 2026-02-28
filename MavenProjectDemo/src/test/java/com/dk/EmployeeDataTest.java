package com.dk;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import mavenprojectdemo.EmployeeData;

class EmployeeDataTest {

	@Test
    void testPrintAllEmployee() {

        EmployeeData employeeData = new EmployeeData();

        assertDoesNotThrow(() -> {
            employeeData.printAllEmployee();
        });};
        @Test
        void testPrintEmployee_ValidId() {

            EmployeeData ed = new EmployeeData();

            assertDoesNotThrow(() -> {
                ed.printEmployee(7369);  
            });}

       /*void testAddEmployee() throws SQLException {
       EMP emp = new EMP(9999,"TestUser","CLERK",7902,Date.valueOf("2024-01-01"), 3000.0,200.0, 10);
                EmployeeData employeeData = new EmployeeData();
                EMP savedEmp = employeeData.addEmployee(emp);
                assertNotNull(savedEmp);
                assertEquals(9999, savedEmp.getEMPNO());
                assertEquals("TestUser", savedEmp.getENAME());
                assertEquals("CLERK", savedEmp.getJOB());
            }*/
            @Test
            void testDeleteEmployee() throws SQLException {

                EmployeeData employeeData = new EmployeeData();
                int testEmpNo = 9998;
                employeeData.deleteEmployee(testEmpNo);

                EMP emp = new EMP(
                        testEmpNo,
                        "DeleteTest",
                        "CLERK",
                        7902,
                        Date.valueOf("2024-01-01"),
                        3000.0,
                        null,
                        10
                );
                employeeData.addEmployee(emp);
                boolean deleted = employeeData.deleteEmployee(testEmpNo);
                assertTrue(deleted);
            }
}
    			 
    			 
    			 
    			 
    			 
    			 
    			 
    			 
    			 
    			 
    			 
    			 
    			 
    			 
    			 
    			 
    			 
    		



