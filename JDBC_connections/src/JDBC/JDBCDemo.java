package JDBC;

import java.sql.*;

public class JDBCDemo {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sample","root","Bhagya@99");

		Statement st = con.createStatement();
		
		//String query = "create table student(ID int primary key,SName varchar(20),SMarks int)";
		//String query1 = "Insert into student value(2, 'Anu',50)";
	   // String query2 = "Delete from student Where ID=2";
	    String query3 = "Update student Set SName='aaruhi' Where ID=1";
		//st.executeUpdate(query);
		//st.executeUpdate(query1);
		//st.executeUpdate(query2);
	    st.executeUpdate(query3);
		System.out.println("Student Table Create Successfully");

		st.close();
		con.close();
	}

}
