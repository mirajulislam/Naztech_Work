package Stream_Work.Stream_Work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//import Reference_to_Instance_Method.Reference_to_Instance_Method.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	List<Employee> empList =  Arrays.asList(
    			new Employee("Raj", "1000", 10000.00,Gender.MALE),
    			new Employee("Miraj", "1001", 15000.00,Gender.MALE),
    			new Employee("Rabi", "1002", 25000.00,Gender.MALE),
    			new Employee("Nila", "1003", 85000.00,Gender.FEMALE));
    	
    
        	 List<Employee> start =empList.stream().filter(p ->p.getName().startsWith("M")).collect(Collectors.toList());
        	 System.out.println(start);
        	 List<Employee> m =empList.stream().filter(p ->p.getGender().equals(Gender.MALE)).collect(Collectors.toList());
        	 System.out.println(m);
        	 List<Employee> female =empList.stream().filter(p ->p.getGender().equals(Gender.FEMALE)).collect(Collectors.toList());
        	 System.out.println(female);
        	 
        	 List<Double> collect = empList.stream().map(x -> x.getSalary()).collect(Collectors.toList());
             System.out.println(collect);     
             Double doubleSum=empList.stream().mapToDouble(Employee::getSalary).sum();
             System.out.println(doubleSum);
         
    }
}
