package Recursion;

import java.util.Scanner;

public class PrefectNumber {
	static boolean isPrefect(int n) {
		return isPrefect(n,1,0);
	}
	static boolean isPrefect(int n,int i,int sum) {
		if(i>n/2)
			return false;
		if(n%i==0)
			sum=sum+i;
		if(n==sum)
			return true;
		return isPrefect(n,i+1,sum);
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Name");
	int n=sc.nextInt();
	boolean rs=isPrefect(n);
	if(rs)
		System.out.println(n+" is a prefect number");
	else
		System.out.println(n+" is not a prefect number");
}
}
