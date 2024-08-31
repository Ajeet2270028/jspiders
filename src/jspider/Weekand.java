package jspider;
import java.util.*;
class Weekand {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();

		switch(n) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thrasday");
			break;
		case 6:
			System.out.println("Farday");
			break;
		case 7:
			System.out.println("saturaday");
			break;
		default:
			System.out.println("Invalid number");
		}

	}
}
