package jspider;
import java.util.*;
class CheckLeapYear {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter month:");
		String mon=sc.next();
		
		switch(mon.toLowerCase()) {
		case "jan":
			System.out.println("31");
			break;
		case "mar":
			System.out.println("31");
			break;
		case "may":
			System.out.println("31");
			break;
		case "jul":
			System.out.println("31");
			break;
		case "Aug":
			System.out.println("31");
			break;
		case "oct":
			System.out.println("31");
			break;
		case "dec":
			System.out.println("31");
			break;
		case "apr":
			System.out.println("30");
			break;
		case "jun":
			System.out.println("30");
			break;
		case "sep":
			System.out.println("30");
			break;
		case "Nov":
			System.out.println("30");
			break;
		case "feb":	
			System.out.println("Enter year");
			switch(sc.nextInt()) {
			case 2024:
				System.out.println("29");
				break;
			case 2023:
				System.out.println("28");
				break;

			}
			break;
			default:
				System.out.println("Invalid input");

		}
	}
}
