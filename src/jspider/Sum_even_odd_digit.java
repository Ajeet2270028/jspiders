package jspider;
import java.util.Scanner;
class Sum_even_odd_digit {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=sc.nextInt();
    int esum=0,osum=0;
    while(n!=0) {
    	int d=n%10;
    	if(d%2==0)
    		esum+=d;
    	else
    		osum+=d;
    	n=n/10;
    }
    System.out.println("sum of even digit: "+esum);
    System.out.println("Sum of odd digit: "+osum);


 }

}
