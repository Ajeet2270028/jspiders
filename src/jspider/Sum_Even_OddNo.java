package jspider;
import java.util.*;
public class Sum_Even_OddNo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a end number:");
	int n=sc.nextInt();
	int n1=n;
	int sum1=0;
	int sum2=0;
	while(n>0) {
		if(n%2==0)
			sum1 +=n;
		else
			sum2 +=n;
		n--;
	}
	System.out.println("Sum of even no 1 to "+n1+"= "+sum1);
	System.out.println("Sum of odd no 1 to "+n1+"= "+sum2);
	
}
}
