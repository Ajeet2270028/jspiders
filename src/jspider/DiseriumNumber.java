package jspider;

import java.util.Scanner;

class DiseriumNumber {
	static int count(int x) {
		int c=0;
		do {
			c++;
			x=x/10;
		}while(x!=0);
		return c;
	}
	
	static int pow(int b,int p) {
		int p1=1;
		while(p>0) {
			p1=p1*b;
			p--;
		}
		return p1;
	}
	
	static boolean isDiseriumNumber(int x) {
		int sum=0,temp=x;
		int ct= count(x);
		do {
			int d=x%10;
			sum=sum+pow(d,ct);
			ct--;
			x=x/10;
		}while(x!=0);
		return sum==temp;
		
	}
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=sc.nextInt();  //135->1^1+3^2+5^3=1+9+125->==135
		boolean rs=isDiseriumNumber(n);
		if(rs)
			System.out.println(n+" is Diserium number");
		else
			System.out.println(n+" is not Diserium number");
}
}
