package jspider;
import java.util.*;
class SumOfNaturalNo {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a range:");
	int n=sc.nextInt();
	int sum=0;
	for(int i=1;i<=n;i++) {
		sum+=i;
	}
	System.out.println("Sum of Number 1 to "+n+" is "+sum);
}
}
