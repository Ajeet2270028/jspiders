package arrays;

import java.util.Scanner;

public class SearchElement {
	static int searchElement(int rs[],int n) {
		for (int i = 0; i < rs.length; i++) {
			if(rs[i]==n) {
				return i;
			}
		}
		return -1;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a size of array");
	int n=sc.nextInt();
	System.out.println("Enter the value of array");
	int ar[]=new int[n];
	for (int i = 0; i < ar.length; i++) {
		ar[i]=sc.nextInt();
	}
	System.out.println("Enter search Element");
	int x=sc.nextInt();
	int rs=searchElement(ar,x);
	System.out.println("print the Position");
	System.out.println(rs);
}
}
