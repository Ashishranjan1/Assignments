package day12;
import java.sql.*;
public class HelloJDBC {
public static void main(String []args)
{
	try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("driver is loaded");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Connection connection=null;
	Statement stmt=null;
	ResultSet rs=null;
	
	try {
		//connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/yms1","root","root");
	connection =ConnectionFactory.getConnection();
		stmt=connection.createStatement();
	rs=stmt.executeQuery("select * from emp1");
	
	while(rs.next())
		System.out.println(rs.getInt(1)+":"+rs.getString(2)+":"+rs.getString(3)+rs.getInt(4));
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
