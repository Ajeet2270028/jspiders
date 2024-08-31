package Recursion;

import java.util.Scanner;

class SumOfArrays {
	static int sumElement(int x[]) {
//		if(x.length==1)
//			return x;
		return sumElement(x,0,x.length-1,0);
		
	}
	static int sumElement(int x[],int i,int l,int sum) {
		if(i>l)
			return sum;
		//sum=sum+x[i];
		return sumElement(x,i+1,l,sum+x[i]);
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of Arrays one:");
	int n=sc.nextInt();
	int []ar1=new int[n];
	System.out.println("Enter a value");
	for(int i=0;i<n;i++) {
		ar1[i]=sc.nextInt();
	}
	int sum=sumElement(ar1);
	System.out.println("Sum of Array Element "+sum);
}
}
