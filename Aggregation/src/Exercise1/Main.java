package Exercise1;

public class Main {

	public static void main(String[] args) {
		
		  Student s1=new Student();  
		  Student s2=new Student();
		  Student s3=new Student();
		  Student s4=new Student();
		  
		  
		  
		  s1.insertValue(101,"Abdullah");
		  s2.insertValue(102,"Kafi");
		  s3.insertValue(103,"Rohim");
		  s4.insertValue(104,"Karim");
		  
		  Department d1 = new Department();
		  Department d2 = new Department();
		  Department d3 = new Department();
		  
		  d1.insertValue(60);
		  d2.insertValue(70);
		  d3.insertValue(80);
		  
		  d1.add(s1);
		  d2.add(s2);
		  d2.add(s3);
		  d3.add(s4);
		  
		  Institution i1= new Institution();
		  i1.insertValue(111);
		  i1.add(d1);
		  i1.add(d2);
		  i1.add(d3);
		  
		  division div=new division();
		  
		  //s1.print();
		  //d1.print();
		  i1.print();
		  

	}

}
