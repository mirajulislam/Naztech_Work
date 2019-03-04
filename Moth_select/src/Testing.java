import java.util.Scanner;

public class Testing {
	
    Month month;
    
    public Testing(Month month) {
    	this.month=month;
    }
    
    
    public void getChooseMonth() {
    	
    	try {
		switch(month) {
		
		case JANUARY:
			System.out.println("This is JANUARY");
			break;
			
		case FEBRUARY:
			System.out.println("This is FEBRUARY");
			break;
		
	    case MARCH:
		   System.out.println("This is MARCH");
		   break; 

        case APRIL:
	       System.out.println("This is APRIL");
	       break;

        case MAY:
         System.out.println("This is MAY");
         break;

       case JUNE:
         System.out.println("This is JUNE");
         break;

       case JULY:
         System.out.println("This is JULY");
         break;

       case AUGUST:
         System.out.println("This is AUGUST");
         break;

       case SEPTEMBER:
          System.out.println("This is SEPTEMBER");
          break;

       case OCTOBER:
       System.out.println("This is OCTOBER");
       break;

       case NOVEMBER:
        System.out.println("This is NOVEMBER");
        break;

        case DECEMBER:
        System.out.println("This is DECEMBER");
        break;

       default:
       System.out.println("In South Direction");
       break;
	}
}catch(Exception unknownException) {
	 System.out.println("In South Direction");
}
    }
    
	public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter your month:");		
          
          String mon=sc.nextLine();
		
        String mon1=mon.toUpperCase();
		Testing t1=new Testing(Month.valueOf(mon1));
		t1.getChooseMonth();
	
	}

}
