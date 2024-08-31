package Recursion;

import java.util.Scanner;

class CountDigit {
	static int count(int n) {
		if(n>=-9&& n<=9)
			return 1;
		return 1+count(n/10);
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in); 
	System.out.println("Enter a nth Number:");
	int n=sc.nextInt();
	int rs=count(n);
	System.out.println("Total no of digit in "+n+" is "+rs);
}
}
