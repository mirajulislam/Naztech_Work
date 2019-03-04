package Exercise1;

public class Institution {
	
	int institutionId;

	int size=0;
	private Department d[]= new Department[2];
	
	void insertValue(int a) {
		
		institutionId = a;
	}
	
	void add(Department a) {
		
		if(size>=d.length-1) {
			Department temp[]=d.clone();
			d = new Department[d.length+1];
			System.arraycopy(temp, 0, d, 0, temp.length);
			
			
		}
		d[size]=a;
		size++;
		
	}
	
	void print() {
		
		for(int i=0;i<size;i++) {
			
			d[i].print();
			System.out.println("Institution ID: "+institutionId);
			System.out.println();
		}
		
	}
	

}
