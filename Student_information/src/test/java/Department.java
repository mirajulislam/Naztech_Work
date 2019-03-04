
public class Department extends Student {

	private String depart;

	
	public String getDepart() {
		return depart;
	}


	public void setDepart(String depart) {
		this.depart = depart;
	}

@Override

	void dispalyInformation() {
	System.out.print("Student Id="+getId());
	System.out.print("Student Department="+getDepart());
		System.out.print("Student name="+getName());
		System.out.print("Student Address="+getAddress());
		System.out.print("Student Mobile="+getMobile());
		
	}
}
