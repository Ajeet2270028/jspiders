package jspider;
import java.util.*;
class ThreeDigitDistinct {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter three digit number");
		int n=s.nextInt();
		 int r1=n%10;
		 n=n/10;
		 int r2=n%10;
		 n=n/10;
		 int r3=n%10;
		 if(r1==r2&& r1==r3&& r2==r3)
			 System.out.println(n+" it is not three distinct");
		
	}

}
