package arrays;

import java.util.Scanner;

class MergeTwoArray {
	static int[] merge(int x[],int y[]) {
		int z[]=new int[x.length+y.length];
		for(int i=0;i<x.length;i++) {
			z[i]=x[i];
		}
		for(int i=0;i<y.length;i++) {
			z[x.length+i]=y[i];
		}
		
	return z;
	}
	
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of Arrays one:");
	int n=sc.nextInt();
	int []ar1=new int[n];
	System.out.println("Enter a value of first arrays");
	for(int i=0;i<n;i++) {
		ar1[i]=sc.nextInt();
	}
	System.out.println("Enter the size of Arrays two:");
	int m=sc.nextInt();
	int []ar2=new int[m];
	System.out.println("Enter a value of Second arrays");
	for(int i=0;i<m;i++) {
		ar2[i]=sc.nextInt();
	}
	int []ar3=merge(ar1,ar2);
	for(int i=0;i<ar3.length;i++){
		System.out.print(ar3[i]+" ");
	}
	
}
}
