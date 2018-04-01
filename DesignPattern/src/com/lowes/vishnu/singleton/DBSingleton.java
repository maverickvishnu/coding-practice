package com.lowes.vishnu.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBSingleton {

	private static DBSingleton instance= new DBSingleton();
	private Connection conn =null;
	private DBSingleton() {
		try {
			DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static DBSingleton getInstance() {
		if(instance ==null) {
			synchronized(DBSingleton.class) {
				if(instance ==null) {
					 instance=new DBSingleton();
				}
			}
		}
		return instance;
	}
	public Connection getConnection() {
		if(conn ==null) {
			synchronized(DBSingleton.class) {
				if(conn ==null) {
					String dbUrl ="jdbc:derby:sampleDB;create=true";
					try {
						conn =DriverManager.getConnection(dbUrl);
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}
		return conn;
	}
}
