package jspider;
import java.util.*;
public class LargeNumber {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two number to find large number");
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	if(num1>num2)
		System.out.println(num1+" is a large number");
	else
		System.out.println(num2+" is a large number");
}
}
