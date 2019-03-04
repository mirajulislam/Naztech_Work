import static org.junit.Assert.*;

import java.util.Scanner;

import Calculaor.Cal_culator;
import junit.framework.Assert;

public class Test {

	@org.junit.Test
	public void testadd() {
		
		Cal_culator c1= new Cal_culator();
		Scanner input=new Scanner(System.in);
		
		float firstValue;
		float secondValue;
		
		float exception,exception1 ;
		System.out.println("For sum");
		System.out.println();
		System.out.println("Enter First value");
		firstValue=input.nextFloat();
		
		System.out.println("Enter Second value");
		secondValue=input.nextFloat();
		
		System.out.println("Enter Exceptation value Sum");
		exception=input.nextFloat();
		

		
		float result=c1.add(firstValue, secondValue);	

		
		Assert.assertEquals(exception, result);

		System.out.println("Sum="+result);
		System.out.println();
	}
//	
	@org.junit.Test
public void testadd1() {
		
		Cal_culator c1= new Cal_culator();
		Scanner input=new Scanner(System.in);
		
		float firstValue;
		float secondValue;
		float exception ;
		
		System.out.println("For Sub");
		System.out.println();
		System.out.println("Enter First value");
		firstValue=input.nextFloat();
		
		System.out.println("Enter Second value");
		secondValue=input.nextFloat();
		
		System.out.println("Enter Exceptation value");
		exception=input.nextFloat();
		
		float result=c1.add1(firstValue, secondValue);	
		
		Assert.assertEquals(exception, result);
		System.out.println("Sub="+result);
		System.out.println();
	}

	@org.junit.Test
public void testadd2() {
		
		Cal_culator c1= new Cal_culator();
		Scanner input=new Scanner(System.in);
		
		float firstValue;
		float secondValue;
		float exception ;
		
		System.out.println("For Mul");
		System.out.println();
		
		System.out.println("Enter First value");
		firstValue=input.nextFloat();
		
		System.out.println("Enter Second value");
		secondValue=input.nextFloat();
		
		System.out.println("Enter Exceptation value");
		exception=input.nextFloat();
		
		float result=c1.add2(firstValue, secondValue);	
		
		Assert.assertEquals(exception, result);
		
		System.out.println("Mul="+result);
		System.out.println();
	}
//	
	@org.junit.Test
	public void testadd3() throws Exception {
			
			Cal_culator c1= new Cal_culator();
			Scanner input=new Scanner(System.in);
			
			float firstValue;
			float secondValue;
			float exception ;
			
			System.out.println("For Div");
			System.out.println();
			
			System.out.println("Enter First value");
			firstValue=input.nextFloat();
			
			System.out.println("Enter Second value");
			secondValue=input.nextFloat();
			
			System.out.println("Enter Exceptation value");
			exception=input.nextFloat();
			
			float result=c1.add3(firstValue, secondValue);	
			
			Assert.assertEquals(exception, result);
			
			System.out.println("Div="+result);
			System.out.println();
		}
	
}
