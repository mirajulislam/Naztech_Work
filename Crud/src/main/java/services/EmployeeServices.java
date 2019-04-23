package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;
import controller.DbConnection;
import dao.EmployeeDAO;
import model.Employee;
import lombok.Getter;
import lombok.Setter;
public class EmployeeServices implements EmployeeDAO {
	
	 private EmployeeDAO employeeDAO;
	 


	public void deleteEmployee(Integer employeeId) {
		
		DbConnection obj_DB_Connection=new DbConnection();
		Connection connection=obj_DB_Connection.get_connection();
		PreparedStatement ps=null;
		try {
			String query="delete from RajData where id=?";
			ps=connection.prepareStatement(query);
			ps.setInt(1, employeeId);
//			System.out.println(ps);
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	}

	public int updateEmployee(Employee employee) {
		DbConnection obj_DB_Connection=new DbConnection();
		Connection connection=obj_DB_Connection.get_connection();
		PreparedStatement ps=null;
		int x=0;
		try {
			String query="update RajData set name=?,password=?,email=?,country=? where id=?";
			ps=connection.prepareStatement(query);
			
			ps.setString(1, employee.getName());
			ps.setString(2, employee.getPassword());
			ps.setString(3, employee.getEmail());
			ps.setString(4, employee.getCountry());
			ps.setInt(5, employee.getId());
			System.out.println(ps);
			ps.executeUpdate();
			x++;
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return x;
	}

	public Employee getEmployee(int employeeid) {
		DbConnection obj_DB_Connection=new DbConnection();
		Connection connection=obj_DB_Connection.get_connection();
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try {
			String query="select * from RajData where id=?";
			ps=connection.prepareStatement(query);
			ps.setInt(1, employeeid);
			System.out.println(ps);
			rs=ps.executeQuery();
			while(rs.next()){
			System.out.println("Sl no -"+rs.getInt("id"));
			System.out.println("name -"+rs.getString("name"));
			System.out.println("email -"+rs.getString("email"));
			System.out.println("Country -"+rs.getString("country"));
			System.out.println();
//			rs.toString();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		return null;
	}

	public void addEmployee(Employee employee) {
		
		DbConnection obj_DB_Connection=new DbConnection();
		Connection connection=obj_DB_Connection.get_connection();
		PreparedStatement ps=null;
	
		try {
			String query="insert into RajData(id,name,password,email,country) values (?,?,?,?,?)";
			ps=connection.prepareStatement(query);
			
			ps.setInt(1, employee.getId());
			ps.setString(2, employee.getName());
			ps.setString(3, employee.getPassword());
			ps.setString(4, employee.getEmail());
			ps.setString(5, employee.getCountry());
			ps.executeUpdate();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

	@Override
	public void getAllEmployees() {
		
		DbConnection obj_DB_Connection=new DbConnection();
		Connection connection=obj_DB_Connection.get_connection();
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try {
			String query="select * from RajData";
			ps=connection.prepareStatement(query);			
			rs=ps.executeQuery();
			while(rs.next()){
				
//				emp.add(rs.getString("id"));
			System.out.println("Sl no -"+rs.getInt("id"));
			System.out.println("name -"+rs.getString("name"));
			System.out.println("email -"+rs.getString("email"));
			System.out.println("Country -"+rs.getString("country"));
			System.out.println();
//			rs.toString();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	
		
	}

	@Override
	public ArrayList<Employee> getAllCustomer() {
		DbConnection obj_DB_Connection=new DbConnection();
		Connection connection=obj_DB_Connection.get_connection();
	       Statement st=null;
		ResultSet rs=null;
		try {
			st=connection.createStatement();
			String query="select * from RajData";
			rs=st.executeQuery(query);
			 ArrayList<Employee> customerList = new ArrayList<>();
			
			while(rs.next()){
				
				Employee empp1=new Employee(rs.getInt("id"),rs.getString("name"),rs.getString("password"),rs.getString("email"),rs.getString("country"));
				customerList.add(empp1);
//				
			}
			System.out.println(customerList);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return null;
	}



	

	
	

}
