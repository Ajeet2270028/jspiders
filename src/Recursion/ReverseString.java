package Recursion;

import java.util.Scanner;

public class ReverseString {
	static String reverse(String st) {
//		if(st.isEmpty())
//			return st;
//		return reverse(st.substring(1))+st.charAt(0);
		return reverse(st,0);
	}
	
	static String reverse(String st,int i) {
		if(i==st.length())
			return "";
		return reverse(st,i+1)+st.charAt(i);
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Name");
	String name=sc.nextLine();
	String rs=reverse(name);
	System.out.println("After reverse the String is :"+rs);
	
}
}
