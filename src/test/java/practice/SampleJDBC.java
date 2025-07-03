package practice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class SampleJDBC {
	
	

		@Test
		public void executeSelectQuery() throws SQLException// read/fetch operation of Database
		{
			// CREATE OBJECT OF DATABASE DRIVER
			Driver dRef = new Driver();

			// Step 1: register Driver
			DriverManager.registerDriver(dRef);

			// Step 2: Establish connection with driver - use DB name
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customerdb", "root", "root");

			// Step 3: Issue Create statement
			Statement state = con.createStatement();

			// Step 4: execute a query
			ResultSet result = state.executeQuery("select * from customerinfo;");
			while (result.next()) {
				System.out.println(result.getString(1) + "-" + result.getInt(2) + "-" + result.getString(3));
			}

			// Step 5: Close the DB
			con.close();
		}

		@Test
		public void executeNONSelectQuery() throws SQLException {
			// CREATE OBJECT OF DATABASE DRIVER
			Driver dRef = new Driver();

			// Step 1: register Driver
			DriverManager.registerDriver(dRef);

			// Step 2: Establish connection with driver - use DB name
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customerdb", "root", "root");

			// Step 3: Issue Create statement
			Statement state = con.createStatement();

			// Step 4: execute a query
			int result = state.executeUpdate("insert into customerinfo values('Neethu',14,'Banglore');");
			if(result==1)
			{
				System.out.println("data added");
			}

			// Step 5: Close the DB
			con.close();
		}



}
