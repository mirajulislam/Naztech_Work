package association;

public class Student {

	int id;
	String Name;
	
//	Student(){
//		
//	}
	public Student(int id, String Name){
		
		this.id = id;
		this.Name = Name;
	}
	
	public String getName() {
		return this.Name;
	}
	
	public int getid() {
		return this.id;
	}
	
}
