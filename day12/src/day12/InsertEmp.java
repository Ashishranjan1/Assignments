package day12;
import java.sql.*;
public class InsertEmp {

	public static void main(String[] args) {
	
		Connection connection=ConnectionFactory.getConnection();
        try {
            PreparedStatement pstmt=connection.
                    prepareStatement("insert into emp1(eid, ename, city, salary) values(?,?,?,?)");
            pstmt.setInt(1, 4);
            pstmt.setString(3, "delhi");
            pstmt.setString(2, "sam");
            pstmt.setDouble(4, 67000.00);

            int noOfRowsEffeted = pstmt.executeUpdate();

            System.out.println(noOfRowsEffeted);

        } catch (SQLException e) {

            e.printStackTrace();
        }
	
	
	
	}

}
