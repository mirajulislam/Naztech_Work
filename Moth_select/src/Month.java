
public enum Month {
	
JANUARY("JANUARY",31),FEBRUARY("FEBRUARY",28),MARCH("MARCH",31),APRIL("APRIL",30),
MAY("MAY",31),JUNE("JUNE",30),JULY("JULY",31),AUGUST("AUGUST",31),SEPTEMBER("SEPTEMBER",30),
OCTOBER("OCTOBER",31),NOVEMBER("NOVEMBER",30),DECEMBER("DECEMBER",31);
	
	private final String month_name;
	private final int day_num;
	
	Month(String month_name,int day_num){
		this.month_name=month_name;
		this.day_num=day_num;
	}
	
	
	
	public String getMonth_name() {
		return month_name;
	}



	public int getDay_num() {
		return day_num;
	}

}

//	public class Choose{
//		Month month;
//		
//	
//		public Choose(Month month) {
//			this.month=month;
//		}
//		
//		public void getChooseMonth() {
//			switch(month) {
//			case JANUARY:
//				System.out.println("This is JANUARY");
//				break;
//				
//			case FEBRUARY:
//				System.out.println("This is FEBRUARY");
//				break;
//			
//		case MARCH:
//			System.out.println("This is MARCH");
//			break;
//	
//	case APRIL:
//		System.out.println("This is APRIL");
//		break;
//	
//case MAY:
//	System.out.println("This is MAY");
//	break;
//
//case JUNE:
//	System.out.println("This is JUNE");
//	break;
//
//case JULY:
//	System.out.println("This is JULY");
//	break;
//
//case AUGUST:
//	System.out.println("This is AUGUST");
//	break;
//
//case SEPTEMBER:
//	System.out.println("This is SEPTEMBER");
//	break;
//
//case OCTOBER:
//	System.out.println("This is OCTOBER");
//	break;
//
//case NOVEMBER:
//	System.out.println("This is NOVEMBER");
//	break;
//
//case DECEMBER:
//	System.out.println("This is DECEMBER");
//	break;
//
//default:
//    System.out.println("In South Direction");
//    break;
//		}
//	}
//}
//	public static void main(String[] args) {
//		String test= "DECEMBER";
//		
////		Choose c1=new Choose(Month.valueOf("DECEMBER"));
////		c1.getChooseMonth();
//	}
//}
//
//
