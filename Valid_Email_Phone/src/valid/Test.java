package valid;

import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.Test;

//import Phone_Gmail_test.Phone;

//import Phone_Gmail_test.Phone;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		Phone p1=new Phone();
		
	    p1.setPhone("01780574060");	
	
	assertEquals("valid",p1.Check());
	}
	@org.junit.jupiter.api.Test
	void test1() {
		
		Phone p1=new Phone();
		p1.setMail("mirjulislam5746@gmail.com");					 
	assertEquals("emailValid",p1.MailCheck());
		
	}

}
