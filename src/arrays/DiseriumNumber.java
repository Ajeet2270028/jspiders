package arrays;

import java.util.Scanner;

class DiseriumNumber {
	static int getNumber(int []x) {
		int count=0;
		for(int i=0;i<x.length;i++) {
			boolean rs=isDiserium(x[i]);
			if(rs)
				count++;
		}
		return count;
	}
	 static boolean isDiserium(int x) {
		 int count=getCount(x);
		 int sum=0,temp=x;
		 do {
			 int d=x%10;
			 sum=sum+pow(d,count);
			   count--;
			   x=x/10;
		 }while(x!=0);
		 return sum==temp;
	 }
	 static int getCount(int x) {
		 int c=0;
		 do {
			 c++;
			 x=x/10;
		 }while(x!=0);
		 return c;
	 }
	 static int pow(int x,int n) {
		 int p=1;
		 do {
			 p=p*x;
			 n--;
		 }while(n>0);
		 return p;
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
		System.out.println("Total diserium number: "+count);
}
}
