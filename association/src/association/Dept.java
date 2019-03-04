package association;

public class Dept {

	int deptId ;
	Student s;
	
	
	
	Dept(int deptId, Student s){
		
		this.deptId = deptId;
		this.s = s;
		 
	}
	
	Dept(){}
	
	Student oldArray[] = new Student[2];
	
	
	public void add(Student s) {
		
		int count = 0;
		int counter = 0;
		
		for (int x=0; x < oldArray.length; x++) {
			
			if (oldArray[x] != null) {
				count +=1;
			}
		        
			if (count == oldArray.length-1) {
				
				Student newArray[] = new Student[oldArray.length+2];
				//arraycopy(Object source_arr, int sourcePos,Object dest_arr, int destPos, int len)
				System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
				oldArray = newArray;
			}
			
			if(oldArray[count]==null && counter==0) {
				oldArray[count]=s;
				counter++;
				break;
			}		
			
		}
		
	}
	
	
		
		public void show() {
		    for(Student el: oldArray) {
		    	
		    	if(el != null) {
		    		
		    		System.out.print(el.getName());
		    		System.out.print("     ");
		    		System.out.println(el.getid());
		    	}
		    	
		    }
		}
		
		public Student getStudentRef() {
			return this.s;
		}

	
	
	
}
