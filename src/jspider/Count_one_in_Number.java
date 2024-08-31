package jspider;

import java.util.Scanner;
class Count_one_in_Number {
	
	static void countOne(int n) {
		int count=0;
		while(n!=0) {
			int d=n%10;
			if(d==1)
				count++;
			n=n/10;
		}
		System.out.println("No of 1: "+count );
	}
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=sc.nextInt();
	countOne(n);
	

 }
}
