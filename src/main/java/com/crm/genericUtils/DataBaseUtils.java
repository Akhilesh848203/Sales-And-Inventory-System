package com.crm.genericUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;




public class DataBaseUtils 
{
	Connection con;
	
	
	/**
	 * this methos is used to connect to database
	 * @throws SQLException
	 */
	//method 001 
	public void connectionToDB() throws SQLException
	{
		//register database
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		con =DriverManager.getConnection(IpathConstants.DBURL,IpathConstants.DBUserName,IpathConstants.DBPassword);
	}
	
	//method 002
	public void executeAndGetData(String query,int colIndex ,String expData) throws SQLException
	{
                 java.sql.Statement state = con.createStatement();
                ResultSet result = state.executeQuery(query);
                 
                boolean flag = false;
                while(result.next())
                {
                	
                	String actualdata = result.getString(colIndex);
                	
                	if(actualdata.equalsIgnoreCase(expData))
                	{
                		flag = true;
                		break;
                	}
                	
                	
                }
                if(flag == true)
                {
                	System.out.println("----data is present-----");
                }else {
                	
                	System.out.println("------data is not present----------");
                }
                
	}

}
















