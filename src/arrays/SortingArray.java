package arrays;

import java.util.Scanner;

public class SortingArray {
	static int[] reverse(int a[]) {
	boolean c[]=new boolean[a.length];
	int z[]=new int[a.length];
	for (int i = 0; i < a.length; i++) {
		if(c[i]==false) {
			for(int j=0;j<a.length;j++) {
				if(a[j]<a[i]) {
						
				}
			}
		}
		
	}
	return z;
		
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Array size:");
	int n=sc.nextInt();
	System.out.println("Enter the value of array");
	int a[]=new int[n];
	for (int i = 0; i < a.length; i++) {
		a[i]=sc.nextInt();
	}
	int []rs=reverse(a);
	for (int i = 0; i < rs.length; i++) {
		System.out.println(rs[i]);
	}
}
}
