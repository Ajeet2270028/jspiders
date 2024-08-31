package jspider;
import java.util.*;
class PrimeNoMain {
	static boolean isPrime(int x) {
		if(x==0||x==1)
			return false;
		for(int i=2;i<=x/2;i++) {
			if(x%i==0)
				return false;
		}
		return true;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=sc.nextInt();
	boolean rs=isPrime(n);
	if(rs)
		System.out.println("it is prime no");
	else
		System.out.println("it is not prime no");
}
}
