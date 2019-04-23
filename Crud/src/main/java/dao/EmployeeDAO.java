package dao;

import java.util.ArrayList;
import java.util.List;

import model.Employee;

 
public interface EmployeeDAO {
 
    public void addEmployee(Employee employee);
 
//    public List<Employee> getAllEmployees();
   public void  getAllEmployees() ;
 
    public void deleteEmployee(Integer employeeId);
 
    public int updateEmployee(Employee employee);
 
    public Employee getEmployee(int employeeid);
    
    public  ArrayList<Employee>  getAllCustomer();
}
