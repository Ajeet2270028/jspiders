package jspider;
import java.util.*;
class Odd_even_Switch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();

		switch(n%2) {
		case 0:
			System.out.println("even no");
			break;

		default:
			System.out.println("odd no");
		}
	}
}
