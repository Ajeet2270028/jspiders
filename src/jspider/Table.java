package jspider;
import java.util.*;
public class Table {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter a number");
	int n=sc.nextInt();
	System.out.println("Table of "+n+" is");
	int i=1;
	while(i<=10) {
		System.out.println(n+"*"+i+"= "+(n*i));
		i++;
	}
	
	
}
}
