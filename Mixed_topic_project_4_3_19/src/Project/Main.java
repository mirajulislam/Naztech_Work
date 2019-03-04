package Project;

public class Main {

	public static void main(String[] args) {
		
//		Person person=new Person();
//		person.setName("Miraj");
//		System.out.println(person.getName());
//		
		Person person=new Person(1001,"Miraj",22,"Male","Dhaka");
		
//		for getter and setter
//		System.out.println("Information"+"\n"+person.getId()+"\n"+person.getName()+"\n"+person.getAge()+"\n"+person.getGender()+"\n"+person.getAddress());
		
		
//		for toString
		System.out.println(person.toString());
		
	         Human	human =new Human(1001,"Miraj",22,"Male","Dhaka", "Happy", "Xyz", "Yxz");	
	         System.out.println(human.toString());
	}

}
