package jspider;
import java.util.*;
public class MutipleOfNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=sc.nextInt();
    int i=3;
    System.out.println("Multiple of 3 to "+n);
    while(i<=n) {
    	System.out.print(i+" ");
    	i +=3;
    }
}
}
