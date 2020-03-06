package com.hrms.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class Recap {
	
	public static String dbUrl = "jdbc:mysql://54.167.125.15:3306/syntaxhrm_mysql";
	public static String dbUsername = "syntax_hrm";
	public static String dbPassword = "syntaxhrm123";
	
	@Test
	public void getAndStoreDataEnchanced() throws SQLException {
		Connection con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		Statement st = con.createStatement();
		ResultSet rset = st.executeQuery("select * from ohrm_location;");
		
		ResultSetMetaData rsetMetaData = rset.getMetaData();
		
		List<Map<String, String>> listData = new ArrayList<>();
		Map<String, String> rowMap;
		
		while(rset.next()) {
			rowMap = new LinkedHashMap<>();
	
			for (int i=1; i<= rsetMetaData.getColumnCount(); i++) {
				rowMap.put(rsetMetaData.getColumnName(i), rset.getObject(i).toString());
		}
			listData.add(rowMap);
		}
	System.out.println(listData);
	con.close();
	st.close();
	rset.close();
	}

}
