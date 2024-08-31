package arrays;

import java.util.Scanner;

public class InsertArray {
	static int[] insertArray(int x[],int idx,int ele) {
		if(idx<0 || idx>x.length) {
			System.out.println("given index is out of range");
			return x;
		}
		
		int z[]=new int[x.length+1];
		z[idx]=ele;
		for(int i=0;i<x.length;i++) {
			if(i<idx)
				z[i]=x[i];
			else
				z[i+1]=x[i];
		}
		return z;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Arrays:");
		int n=sc.nextInt();
		int []ar1=new int[n];
		System.out.println("Enter a value of arrays");
		for(int i=0;i<n;i++) {
			ar1[i]=sc.nextInt();
		}
		System.out.println("Enter index value");
		int index=sc.nextInt();
		System.out.println("Enter valuevto insert to array");
		int ele=sc.nextInt();

	
	int []ar3=insertArray(ar1,index,ele);
	for(int i=0;i<ar3.length;i++){
		System.out.print(ar3[i]+" ");
	}
}
}
