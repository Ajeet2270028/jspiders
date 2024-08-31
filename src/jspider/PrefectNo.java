package jspider;

import java.util.Scanner;

class PrefectNo {
	static boolean isPrefect(int x) {
		int sum=0;
		for(int i=1;i<=x/2;i++) {
			if(x%i==0)
				sum=sum+i;
		}
		return sum==x;
	}
	
	public static void main(String[] args) {	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=sc.nextInt();  //28=1,2,4,7,14
	boolean rs=isPrefect(n);
	if(rs)
		System.out.println(n+" is Prefect Number");
	else
		System.out.println(n+" is not prefect number");
	}
}
