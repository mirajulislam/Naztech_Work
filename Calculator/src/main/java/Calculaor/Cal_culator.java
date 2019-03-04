package Calculaor;

public class Cal_culator {

	public float add(float a,float b) {
		 float sum=0;
		 
		 sum=a+b;
		 System.out.println(sum);
		 return sum;
	}
	
	public float add1(float a,float b) {
		 float sub=0;
		 
		 sub=a-b;
		 return sub;
	}
	
	public float add2(float a,float b) {
		 float mul=0;
		 
		 mul=a*b;
		 return mul;
	}

	public float add3 (float a,float b)throws Exception {
		 float div;

			 div=a/b;
			 return div;
	
			
		
	}
}
