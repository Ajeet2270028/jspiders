package arrays;

import java.util.Scanner;

public class MergeTwoArrayAltnateElement {
	
	static int[] AltnameMerge(int x[],int y[]) {
		int z[]= new int [x.length+y.length];
		int i=0,j=0,k=0;
		while(i<x.length && j<y.length) {
			z[k++]=x[i++];
			z[k++]=y[j++];
			
		}
		while(i<x.length) {
			z[k++]=x[i++];	
		}
		while(j<y.length) {
			z[k++]=y[j++];
			
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
	int []ar3=AltnameMerge(ar1,ar2);
	for(int i=0;i<ar3.length;i++){
		System.out.print(ar3[i]+" ");
}
}
}
