package Calculator;

public class Properties {
	
	
	
	public double a;
	public double b;
	public double result;
	
	public void add() {
//		double sum=0;
		
		result=a+b;		
		System.out.println("Add="+result);
	}

	public void sub() {
//		double sub1=0;
		
		result=a-b;		
		System.out.println("Sub ="+result);
	}
	
	public void mul() {
//		double mul1=0;
		
		result=a*b;		
		System.out.println("Mul ="+result);
	}
	
	public void div() {
//		double div1=0;
		try {
			result=a/b;	
			
		System.out.println("Div ="+result);
	}catch(ArithmeticException exception) {
		exception.getMessage();
		System.out.println("Divide by zero");
	}
		
	}
	
//	public void result(double i,double j) {
//		this.a=i;
//		this.b=j;
//	   
//	}
	
//	this is constructor and create
	public Properties(double x,double y) {
		this.a=x;
		this.b=y;
	}
}
