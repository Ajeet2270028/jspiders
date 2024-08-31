package Recursion;

import java.util.Scanner;

class HappyNo {
	static boolean isHappy(int n) {
		if(n<=9)
			return n==1||n==7;
		return isHappy(sumOfDigit(n));
	}
	static int sumOfDigit(int n) {
		if(n==0)
			return 0;
		return n%10*n%10+sumOfDigit(n/10);
	}
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a  number:");
	int n=sc.nextInt();
	boolean rs=isHappy(n);
	if(rs)
		System.out.println(n+" is a happy number");
	else
		System.out.println(n+" is not a happy number");
	sc.close();
}
}
