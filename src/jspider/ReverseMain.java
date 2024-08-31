package jspider;

import java.util.Scanner;

class ReverseMain {
	static int reverse(int n) {
		int sum=0;
		do {
			int d=n%10;
			sum=sum*10+d;
			n=n/10;
		}while(n!=0);
		return sum;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=sc.nextInt();
	int rs=reverse(n);
	System.out.println("Reverse no="+rs);
	
}
}
