package Recursion;

import java.util.Scanner;

public class PrimeNumber {
	static int checkPrime(int n) {
		if(n==0||n==1)
			return -1;
		return checkPrime(n,2);
	}
	static int checkPrime(int n,int i) {
		if(i>n/2)
			return 1;
		if(n%i==0)
			return -1;
		return checkPrime(n,i+1);
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in); 
	System.out.println("Enter a n Number:");
	int n=sc.nextInt();
	int rs=checkPrime(n);
	if(rs==-1)
		System.out.println(n+" is not Prime number");
	else
		System.out.println(n+" is prime number");
}
}
