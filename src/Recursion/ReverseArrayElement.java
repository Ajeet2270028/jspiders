package Recursion;

import java.util.Scanner;

class ReverseArrayElement {
	static int[] reverse(int x[]) {
		if(x.length==1)
		return x;
		return reverse(x,0,x.length-1);
	}
	static int[] reverse(int x[],int f,int l) {
		if(f>=l)
			return x;
		
			int temp=x[f];
		    x[f]=x[l];
		    x[l]=temp;
		    return reverse(x,f+1,l-1);
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
	int ar2[]=reverse(ar1);
	System.out.println("After reverse Array");
	for(int i=0;i<n;i++) {
		System.out.print(ar2[i]+" ");
	}
}
}
