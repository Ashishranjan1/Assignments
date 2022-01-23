import java.sql.*;
public class JdbcConnectionDemo {

    public static void main(String[] args) {
        //driver? load karna hoga
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("driver is loaded");
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        }

        try {
            Connection connection=DriverManager.
                    getConnection("jdbc:mysql://localhost:3306/ymsli?useSSL=false", "root", "root");
            System.out.println("connection is done");

            //i want to print details of all books
            Statement stmt=connection.createStatement();
            ResultSet rs=stmt.executeQuery("select * from Book");
            while(rs.next()) {
                System.out.println(rs.getInt(1)+": "+ rs.getString(2)+" : "+ rs.getString(3)+": "+ rs.getDouble(4)+ ": "+ rs.getString(5));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
 
}