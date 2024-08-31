package jspider;
import java.util.*;
public class Positive_Negative {

	static int number(int n) {
		if(n<0)
			return 0;
		return 1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int s=number(n);
		if(s==1)
			System.out.println("Positive No");
		else
			System.out.println("Negative no");
	}
}
