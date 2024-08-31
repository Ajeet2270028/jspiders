package jspider;

import java.util.Scanner;

class PalindromeNumber {
	
	static boolean isPalindrome(int x) {
		int rev=0,temp=x;
		do {
			int d=x%10;
			rev=rev*10+d;
			x=x/10;
		}while(x!=0);
		return rev==temp;
		
	}
public static void main(String[] args) {
	
	 Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=sc.nextInt(); 
		
		boolean rs=isPalindrome(n);
		if(rs)
			System.out.println(n+" is Palindrome No");
		else
			System.out.println(n+" is not Paliandrome No");
}
}
