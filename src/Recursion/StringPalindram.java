package Recursion;

import java.util.Scanner;

public class StringPalindram {
	static boolean isPalindrame(String st) {
		return isPalindrame(st,0,st.length()-1);
	}
	static boolean isPalindrame(String st,int f,int l) {
		if(f>=l)
			return true;
		if(st.charAt(f)!=st.charAt(l))
			return false;
		return isPalindrame(st,f+1,l-1);
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Name");
	String name=sc.next();
	boolean rs=isPalindrame(name);
	if(rs)
		System.out.println(name+" is a palindrame String");
	else
		System.out.println(name+" is not a palidrame String");
	
}
}
