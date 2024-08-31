package jspider;
import java.util.*;
class MonthName {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int a=sc.nextInt();

		switch(a) {
		case 31:
			System.out.println("Jan, Mar, May, Jul, Aug, Oct,Dec");
			break;
		case 30:
			System.out.println("Apr ,Jun ,Sep, Nov");
			break;
		case 28:
//			System.out.println("Feb"); 
//			break;
		case 29:
			System.out.println("Feb");
			break;
		default:
			System.out.println("Invalid number");
		}
	}
}
