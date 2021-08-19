package databaseconnection;
import java.sql.*;

public class databasecon
{
	static Connection con;
	public static Connection getconnection()
	{
 		
 			
		try
		{
			Class.forName("com.mysql.jdbc.Driver");	
			con = DriverManager.getConnection("jdbc:mysql://database-1.cpf04ydvjalc.ap-southeast-1.rds.amazonaws.com/activity","admin","srimanta443");
		}
		catch(Exception e)
		{
			System.out.println("class error");
		}
		return con;
	}
	
}
