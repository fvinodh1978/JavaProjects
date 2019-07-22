package com.oops.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCBatchProcessingDemo {

	private static Object n;

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		//Grouping all the related DML Queries(not select) and contacting DB one time
		//for each DML Query is executed, it will return count of the records affected
		//if the batch is success, we need not clear the batch, if is failure, we can clear manually
		Class.forName("Oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost");
		Statement st = con.createStatement();
		con.setAutoCommit(false);
		st.addBatch("Insert into emp values(1, 2, 3);");
		st.addBatch("Insert into emp values(3, 6, 7);");
		try {
			int[] numberofRowsAffected=st.executeBatch();
			con.commit();
			int [] n ={1,2,3,4};
			for(int x:n){
				System.out.println("Number of records affected = " + x);
			}
		}catch(Exception e){
			con.rollback();
			System.out.println();
		}
	}
}
