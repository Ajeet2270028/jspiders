package jspider;
import java.util.*;
class Two_digit_special_number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two digit number:");
		int n=sc.nextInt();

				if(n>9 && n<100) {
					int r=n%10;
					int p=n/10;
					int sum=r+p;
					int product=r*p;
					if((sum+product)==n)
						System.out.println(n+" it is two digit special number");
					else
						System.out.println(n+" it is not two digit special number");
				}
				else
					System.out.println("it is not two digit number, please enter two digit interger number");
	}
}
