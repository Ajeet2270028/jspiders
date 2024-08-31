package jspider;
import java.util.*;
class Desc_3DigitNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three interger value:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
				int big=a;
				int small=c;
				if(b>big)
					big=b;
				if(c>small)
					small=c;
				int mid=(a+b+c)-(big+small);
				System.out.println(big+" "+mid+" "+small);
//		if(a>b && a>c && b>c)
//			System.out.println(a+" "+b+" "+c);
//		if(b>a && b>c && c>a)
//			System.out.println(b+" "+c+" "+a);
//		if(c>a&& c>b && b>a)
//			System.out.println(c+" "+b+" "+a);
	}
}
