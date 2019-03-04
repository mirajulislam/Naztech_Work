package Calculator;

import java.util.Scanner;

public class claculation{

	public static void main(String[] args) {
//		Properties d1=new Properties();
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Value");
		double first=sc.nextDouble();
		System.out.println("Enter Second Value");
		double second=sc.nextDouble();
		
		Properties d1=new Properties(first,second);
		
//
//	      d1.result(first, second);
	      d1.add();
	      d1.sub();
	      d1.mul();
	      d1.div();
          
	}
}