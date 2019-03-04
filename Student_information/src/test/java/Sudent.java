
public class Sudent {



	public String name;
	public String address;
	public int mobile;	
	public int id;
	   
	Sudent(String name,String address,int mobile ,int id) {
    	   this.id=id;
    	   this.name=name;
    	   this.mobile=mobile;
    	   this.address=address;     
    	   }
	   void display() {
		   System.out.println("Name="+name+"  Id="+id+"  Address="+address+"  Mobile="+mobile);
	   }
}


