package com.dk;

import java.sql.Connection;

import mavenprojectdemo.DBConnection;

public class DBConnectionTest {
	
	    public static void main(String[] args) {
	        try (Connection conn = DBConnection.getConnection()) {

	            if (!conn.isClosed()) {
	                System.out.println("Connection Successful ");
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}


