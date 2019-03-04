package Exercise1;

public class Department {
	
	int deptId;

	
	int size=0;
	
	
	
	void insertValue(int a ) {
		
		deptId = a;
	
		
	}
	
	private Student s[]= new Student[2];
	
	void add(Student a) {
		
		if(size>=s.length-1) {
			
			Student temp[]=s.clone();
			s = new Student[s.length+1];
			System.arraycopy(temp, 0, s, 0, temp.length);
		
			
		}
		s[size]=a;
		size++;
		
	}
	
	
	
	void print() {
		
		for(int i=0; i<size;i++) {
			
			s[i].print();
			System.out.println("Department ID: "+deptId);
			
		}
		
	}

}
