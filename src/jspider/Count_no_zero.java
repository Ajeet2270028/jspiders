package jspider;
import java.util.Scanner;
class  Count_no_zero {
	static void countZero(int n) {
		int count=0;
		do {
			int d=n%10;
			if(d==0)
				count++;
			n=n/10;
		}while(n!=0);
		System.out.println("No of Zero: "+count );

	}
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=sc.nextInt();
	countZero(n);
	
 }
}


