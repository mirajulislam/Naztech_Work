
public class App {

	public static void main(String[] args) {
	     Student student1 = new Student();
	        student1.setId("1");
	        student1.setName("Refat");
	     
	        Student student2 = new Student();
	        student2.setId("2");
	        student2.setName("Ana");
	        
	        Student student3 = new Student();
	        student3.setId("3");
	        student3.setName("Kamrul");
	        
	        Student student4 = new Student();
	        student4.setId("4");
	        student4.setName("Joyee");
	        
	        Student student5 = new Student();
	        student5.setId("5");
	        student5.setName("Daud");
	        
	        Student student6 = new Student();
	        student6.setId("6");
	        student6.setName("Rashadin");
	        
	        Department dept = new Department();
	        dept.setDeptName("CSE");
	        dept.add(student1);
	        dept.add(student2);
	        dept.add(student3);

	        System.out.println("\n");
	        
	        Institute inst = new Institute();
	  
	        Department dept2= new Department();
	        dept2.setDeptName("EEE");
	        dept2.add(student4);
	        dept2.add(student5);
	        dept2.add(student6);
	        
	      //one to many relationship
	        inst.setInstituteName("EWU");
	        inst.add(dept);
	        inst.add(dept2);

	}

}
