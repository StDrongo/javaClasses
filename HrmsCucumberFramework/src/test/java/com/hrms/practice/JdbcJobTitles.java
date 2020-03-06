package com.hrms.practice;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import com.mysql.cj.protocol.Resultset;

public class JdbcJobTitles {
	
	String dbUrl="jdbc:mysql://54.167.125.15:3306/syntaxhrm_mysql";
	
	String UserName = "syntax_hrm";
	
	String password = "syntaxhrm123";
			
	@Test
	public void getMetaData() throws SQLException {
		
		Connection c = DriverManager.getConnection(dbUrl, UserName, password);
		
		System.out.println("Connection is created");
		
		DatabaseMetaData dbData = c.getMetaData();
		String dbName = dbData.getDatabaseProductName();
		String dbVersion = dbData.getDatabaseProductVersion();
		
	System.out.println(dbName);
	System.out.println(dbVersion);
	
	Statement s = c.createStatement();
	ResultSet rset = s.executeQuery("select * from hs_hr_employees where emp_number=6758;");
	
	ResultSetMetaData resultData = rset.getMetaData();
	int cols = resultData.getColumnCount();
	String cName = resultData.getColumnName(1);
	
	System.out.println(cols);
	System.out.println(cName);
	
	for(int i = 1; i<=cols; i++) {
		String colName = resultData.getColumnName(i);
		System.out.println(colName);
	}
	
	s.close();
	rset.close();
	c.close();
	
	}
	

}
