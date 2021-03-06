
import java.util.List;

public class Department {
	
	  private static final int SIZE_FACTOR=5;
		
		private Object data[];
		
		private int index=0;
		
		private int size;
		
		public Department(){
			this.data=new Object[SIZE_FACTOR];
			this.size=SIZE_FACTOR;
		}

		private String deptName;


	

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	
	

	
	public void add(Object obj){
		System.out.println("Student added to "+this.index+" Array size: "+this.data.length);

		//System.out.println("index:"+this.index+"size:"+this.size+"data size:"+this.data.length);
		if(this.index==this.size-1){
			//we need to increase the size of data[]
			increaseSizeAndReallocate();
		}
		data[this.index]=obj;
		this.index++;
		
	}
	
	
	private void increaseSizeAndReallocate() {
		this.size=this.size+SIZE_FACTOR;
		Object newData[]=new Object[this.size];
		for(int i=0; i<data.length;i++){
			newData[i]=data[i];
		}
		this.data=newData;
		System.out.println("***index:"+this.index+"size:"+this.size+"data size:"+this.data.length);
	}
	
	public Object get(int i) throws Exception{
		if(i>this.index-1){
			throw new Exception("ArrayIndexOutOfBound");
		}
		if(i<0){
			throw new Exception("Negative Value");
		}
		return this.data[i];
		
	}



	
}

