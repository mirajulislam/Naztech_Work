package Project;


public class Human extends Person implements Student {
	
	
	
	protected String  feeling;
	protected String through;	
	protected String humaeties;
	
	
	public Human(int id, String name, int age, String gender, String address, String feeling, String through,
			String humaeties) {
		super(id, name, age, gender, address);
		this.feeling = feeling;
		this.through = through;
		this.humaeties = humaeties;
	}


	@Override
	public String toString() {
		return "human [feeling=" + feeling + ", through=" + through + ", humaeties=" + humaeties + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getAge()=" + getAge() + ", getGender()=" + getGender()
				+ ", getAddress()=" + getAddress() + ", toString()=" + super.toString() + "  ]";
	}



	public void study() {
		
	}
	
	
	public void exam() {
		
	}
	
	
}
