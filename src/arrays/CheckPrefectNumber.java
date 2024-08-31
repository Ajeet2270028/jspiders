 package arrays;

import java.util.Scanner;

class CheckPrefectNumber {
	static int getNumber(int []x) {
		int count=0;
		for(int i=0;i<x.length;i++) {
			boolean rs=isPrefect(x[i]);
			if(rs)
				count++;
		}
		return count;
	}
	
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
		System.out.println("Enter a size of arrays:");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter value "+n+" size");
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int count=getNumber(ar);
		System.out.println("Total perfect no: "+count);
	}
	
}
