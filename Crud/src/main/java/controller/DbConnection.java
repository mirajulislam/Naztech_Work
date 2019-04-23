package controller;

import java.sql.Connection;
import java.sql.DriverManager;
public class DbConnection {

	public Connection get_connection(){
		
		 Connection connection=null;
		try {
             
		  connection = DriverManager.getConnection("jdbc:sqlserver://vNTDACWSSQLD002:1433;"
					+ "databaseName=DEV_TEST;user=dev_test_dbo;password=dev_test_dbo123");
//			 System.out.println("Connection Successful");
			
		} catch (Exception e) {
		  System.out.println(e.getMessage());
		}
		  return connection;
		}
		}

