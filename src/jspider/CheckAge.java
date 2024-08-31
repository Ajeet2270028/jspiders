package jspider;
import java.util.*;
class CheckAge {
	
	static String checkAge(int n) {
		String st="";
		if(n>18)
		 return st=st+"Eligible";
		else
			return st=st+" Not Eligible";
	}
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a age:");
	int age=sc.nextInt();
	
	String st=checkAge(age);
	System.out.println(st);
}
}
