package string;

import java.util.Scanner;

public class CheckPalindramString {
	static boolean isPalindrome(String s) {
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			char temp=c[i];
			c[i]=c[c.length-1-i];
			c[c.length-1-i]=temp;
		}
		String st1=new String(c);
		return st1.equals(s);
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String");
	String st=sc.nextLine();
	boolean rs=isPalindrome(st);
	if(rs)
		System.out.println("this is Palindrome String");
	else
		System.out.println("This is not Palindrome String");
}
}
