package jspider;

import java.util.Scanner;

class EmirpNumber {
	static boolean isPrime(int n){
		if(n==1||n==0)
			return false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	static boolean isEmirp(int n) {
		int rev=0,temp=n;
		do {
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
		}while(n!=0);
		return isPrime(rev);
	}
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	boolean rs=isPrime(n) && isEmirp(n);
	if(rs)
		System.out.println(n+" is Emirp number");
	else
		System.out.println(n+" is not Empire number");
	
}
}
