package com.empapp.model.persistence;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
public class EmployeeDaoImpl implements EmployeeDao{
 
	private Connection connection;
	
	public EmployeeDaoImpl()
	{
		connection=ConnectionFactory.getConnection();
	}
	@Override
	public void addEmployee(Employee employee) {
		PreparedStatement pstmt;
		try {
			pstmt = connection.prepareStatement
			("insert into emp1(eid, ename, city, salary) values(?,?,?,?)");
			pstmt.setInt(1, 4);
	        pstmt.setString(3, "delhi");
	        pstmt.setString(2, "sam");
	        pstmt.setDouble(4, 67000.00);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}

	@Override
	public void deleteEmployee(int id) {
	
	}

	@Override
	public void updateEmployee(int id, Employee employee) {
		  try {
	            PreparedStatement pstmt=connection.prepareStatement
	                    ("update emp1 set salary=? where id=?");

	            pstmt.setDouble(1, employee.getSalary());
	            pstmt.setInt(2, employee.getEid());

	            pstmt.executeUpdate();

	        }catch(SQLException ex) {
	            ex.printStackTrace();
	        }
	    
	}

	@Override
	public List<Employee> getAll() {
		
		List<Employee> employees=new ArrayList<Employee>();
		 Employee tempEmployee=null;
		try {
			PreparedStatement pstmt=connection.prepareStatement("select * from emp1");
		    ResultSet rs=pstmt.executeQuery();
		    while(rs.next())
		    {
		    	tempEmployee=new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));

		    }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return null;
	}

	@Override
	public Employee getById(int id) {
		return null;
	}

}
