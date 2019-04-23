package services;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Employee;

public class EmployeeServicesTest {

	@Test
	public void test() {
		Employee emp2=new Employee(1001,"Miraj","Islam","miraj@gmail.com","Bangladesh");
		EmployeeServices emplist1=new EmployeeServices();
		emplist1.updateEmployee(emp2);
		assertEquals(1, emplist1.updateEmployee(emp2));
	}

}
