package mavenprojectdemo;



import com.dk.EMP;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class EmployeeData {

    public void printAllEmployee() throws SQLException {

        String query = "SELECT * FROM emp";

        try (Connection con = DBConnection.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            System.out.println("EMPNO ENAME JOB SAL");

            while (rs.next()) {

                int empno = rs.getInt("empno");
                String ename = rs.getString("ename");
                String job = rs.getString("job");
                double sal = rs.getDouble("sal");

                System.out.println(empno + "   " + ename + "   " + job + "   " + sal);
            }
        }
    }
    public void printEmployee(int id) throws SQLException {
    	try (Connection con = DBConnection.getConnection();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM EMP where empno="+id)){
    		if (rs.next()) {
    		int empno = rs.getInt("empno");
            String ename = rs.getString("ename");
            String job = rs.getString("job");
            double sal = rs.getDouble("sal");
            System.out.println(empno + "   " + ename + "   " + job + "   " + sal);
    	}
    		else{
    			System.out.println("Employee id does not exist");}
    		}
    	
    }
    public EMP  addEmployee(EMP emp) throws SQLException{
    	try (Connection con = DBConnection.getConnection()){;
    	String sql = "INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) "
    	           + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setInt(1,emp.getEMPNO());
                stmt.setString(2,emp.getENAME());
                stmt.setString(3,emp.getJOB());
                stmt.setObject(4,emp.getMGR());
                stmt.setDate(5,(Date) emp.getHIREDATE());
                stmt.setObject(6, emp.getSAL());
                stmt.setObject(7, emp.getCOMM());
                stmt.setObject(8, emp.getDEPTNO());
                
                int rowsUpdated=stmt.executeUpdate();
                if (rowsUpdated!=1) {
                	throw new RuntimeException("Some Error occured");
                }
                else {
                	return emp;
                }
    	
    			
    		}
  
    }
    public boolean deleteEmployee(int id) throws SQLException {
    	try (Connection con = DBConnection.getConnection()){;
    	String sql = "Delete from emp where empno=?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, id);
        int rowsUpdated=stmt.executeUpdate();
        if (rowsUpdated!=1) {
        	throw new RuntimeException("Some Error occured");
        }
        else {
        	return true;
        }
    }
}}