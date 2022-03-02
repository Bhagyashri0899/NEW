// Result Set 

package JDBC;

import java.sql.*;

public class sampleJDBCpg {

	public static void main(String[] args) throws Exception    {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
        
                Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sample","root","Bhagya@99");
                
        		Statement stmt = con.createStatement();
        		//String query = "create table employee(EmpID int primary key,EmpName varchar(20),EmpSalary float)";
        		
        		String query1 = "insert into employee values(6,'unnati',50)";
        		//String query = "select * from employee";
        		ResultSet rs = stmt.executeQuery("SELECT EmpID ,EmpName, EmpSalary FROM employee ");
        		while(rs.next())
        		{        	
        			int EmpID = rs.getInt("EmpID");
        			String EmpName = rs.getString("EmpName");
        			float EmpSalary = rs.getFloat("EmpSalary");
        			System.out.println(EmpID + ", " + EmpName + "," + EmpSalary);
                             
        			
        			//System.out.println(rs.getString(1));
        			//System.out.println(rs.getString(2));
        			//System.out.println(rs.getString(3));
        			
           		}
        				
        	   // stmt.executeUpdate(query);
        	   stmt.executeUpdate(query1);
        				
        	    //System.out.println("employee table created successfully");
        		System.out.println("Row inserted successfully");
        		
        	stmt.close();
    		con.close();
}
}