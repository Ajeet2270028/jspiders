package arrays;

import java.util.Scanner;

public class MergeTwoArrayToSpecificindex {
	
	//method 1
//	static int [] mergeArray(int x[],int y[],int idx) {
//		if(idx<0 || idx>x.length || idx>y.length) {
//			System.out.println("given index is out of range");
//			
//		}
//		int z[]=new int[x.length+y.length];
//		int j=0,k=0;
//		for(int i=0;i<z.length;i++) {
//			if(i<idx)
//				z[i]=x[j++];
//			else if(i<y.length+idx)
//				z[i]=y[k++];
//			else
//				z[i]=x[j++];
//		}
//		return z;
//	}
	
	//method 2
	static int [] mergeArray(int x[],int y[],int idx) {
		if(idx<0 || idx>x.length || idx>y.length) {
			System.out.println("given index is out of range");
			
		}
		int z[]=new int[x.length+y.length];
		
		for(int i=0;i<y.length;i++) {
			z[idx+i]=y[i];
		}
		for(int i=0;i<x.length;i++) {
			if(i<idx)
				z[i]=x[i];
			else
				z[y.length+i]=x[i];
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
	int index=sc.nextInt();
	int []ar3=mergeArray(ar1,ar2,index);
	for(int i=0;i<ar3.length;i++){
		System.out.print(ar3[i]+" ");
	}
}
}
