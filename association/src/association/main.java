package association;
import java.util.ArrayList; // import the ArrayList class



public class main {

	public static void main(String[] args) {

		Student s1=new Student(1,"Raj");
		Student s2=new Student(2,"Robi");
		
		Student s3=new Student(3,"Lal");
		Student s4=new Student(4,"Nil");
		
		Dept dt1= new Dept();
//		Dept dt2= new Dept(2,s1);
//		Dept dt3= new Dept(3,s1);
//	 
		
		dt1.add(s1);
		dt1.add(s2);
		dt1.add(s3);
		dt1.add(s4);
		dt1.add(s2);
		dt1.add(s3);
		
		dt1.show();
		Institute t1 = new Institute();
		t1.add(dt1);
		t1.add(dt1);
		t1.add(dt1);
		//System.out.println(t1.show());
	}

}
