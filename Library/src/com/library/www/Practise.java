package com.library.www;

import java.sql.*;

public class Practise {

	public static void main(String[] args)throws SQLException  {
		// TODO Auto-generated method stub
		deposit();
		

	}
	public static void deposit() throws SQLException {
		String url="jdbc:mysql://localhost:3306/library";
		String username="root";
		String password="Vasanth@1761";
		String query="select*from details";
		Connection con=DriverManager.getConnection(url,username,password);
		Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        ResultSetMetaData rsmd = rs.getMetaData();
        int columnsNumber = rsmd.getColumnCount();
        while (rs.next()) {
            for (int i =1; i <= columnsNumber; i++) {
              //  if (i > 1) System.out.print(",  ");
                String columnValue = rs.getString(i);
               System.out.println( rsmd.getColumnName(i)+ " : "+columnValue+" " );
            }
            System.out.println("");
        }
        
                
        con.close();

    }
 // Java Program to Update contents in a table

      /**  public static void result() throws SQLException
        { 
            String url = "jdbc:mysql://localhost:3306/library";
            String userName = "root";
            String passWord = "Vasanth@1761";
            Connection con = DriverManager.getConnection(url,userName,passWord); 
            String query = "update student set studentName='Vasanth' where rollNo=3500"; 
            PreparedStatement p = con.prepareStatement(query); 
            p.execute(); 
        } 
**/

		
	}

