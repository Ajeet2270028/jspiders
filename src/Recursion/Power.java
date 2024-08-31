package Recursion;

import java.util.Scanner;

public class Power {
	static int power(int p,int n) {
		if(n==0)
			return 1;
		if(p==0)
			return 0;
		return p*power(p,n-1);
	}
   public static void main(String[] args) {
	
	   Scanner sc=new Scanner(System.in); 
		System.out.println("Enter a number or power:");
		int p=sc.nextInt();
		int n=sc.nextInt();
		int rs=power(p,n);
		System.out.println("Power of "+p+" of "+n+" is "+rs);
}
}
