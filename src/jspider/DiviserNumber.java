package jspider;
import java.util.*;

public class DiviserNumber {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	int i=1;
	System.out.println("Diviser of "+n+" is: ");
	while(i<=n) {
		if(n%i==0)
		System.out.print(i+" ");
		i++;
	}
}
}
