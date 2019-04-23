package controller;

import java.util.Arrays;
import java.util.List;


import model.Employee;
import services.EmployeeServices;


public class Main {

	
	public static void main(String[] args) {
		
//		for add data
//		Employee emp1=new Employee(1001,"Miraj","islam","miraj@gmail.com","Bangladesh");
//		EmployeeServices emplist=new EmployeeServices();
//		emplist.addEmployee(emp1);
		
//		for update data
//		Employee emp2=new Employee(1001,"Miraj","islam","miraj@gmail.com","Bangladesh");
//		EmployeeServices emplist1=new EmployeeServices();
//		emplist1.updateEmployee(emp2);
		
//		for search
//		EmployeeServices emplist2=new EmployeeServices();
//		emplist2.getEmployee(1001);

//		for delete
//		EmployeeServices emplist3=new EmployeeServices();
//		emplist3.deleteEmployee(1001);
		
//		for arraylist display
//		EmployeeServices emplist2=new EmployeeServices();
//		emplist2.getAllCustomer();
//		display data
		EmployeeServices emplist3=new EmployeeServices();
		emplist3.getAllEmployees();
		
	}

}
