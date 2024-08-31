package Recursion;

import java.util.Scanner;

class SearchArrayElement {
static int check(int a[],int e) {
	
	return check(a,e,0);
}
static int check(int a[],int e,int idx) {
	if(idx==a.length)
		return -1;
	if(a[idx]==e)
		return idx;
	return check(a,e,idx+1);
}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Arrays one:");
		int n=sc.nextInt();
		int []ar1=new int[n];
		for(int i=0;i<n;i++) {
			ar1[i]=sc.nextInt();
		}
		System.out.println("Enter element to search");
		int ele=sc.nextInt();
		int rs=check(ar1,ele);
		if(rs==-1)
			System.out.println("Element is not found");
		else
			System.out.println("number is present "+rs+" index");
	}
}
