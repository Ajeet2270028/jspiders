package jspider;
import java.util.*;
class Time_Table {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a number to display subject");
		int a=sc.nextInt();	

		switch(a) {
		case 1:
			System.out.println("Kannada");
			break;
		case 2:
			System.out.println("English");
			break;
		case 3:
			System.out.println("Maths");
			break;	

		case 4:
			System.out.println("Science");
			break;
		case 5:
			System.out.println("Social");
			break;
		case 6:
			System.out.println("Gk");
			break;
		case 7:
			System.out.println("Sunday Holiday");
			break;

		default:
			System.out.println("Invalid Number");
		}		
	}
}
