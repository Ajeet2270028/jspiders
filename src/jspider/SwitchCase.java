package jspider;
import java.util.*;
class SwitchCase {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int a=sc.nextInt();
	switch(a) {
	case 1:
		System.out.println("One");
		break;
	case 2:
		System.out.println("Two");
		break;
	case 3:
		System.out.println("Three");
		break;
	case 4:
		System.out.println("Four");
		break;
	default:
		System.out.println("Invalid");
		
	}
}
}
