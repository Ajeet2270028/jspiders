package jspider;

import java.util.Scanner;

class Xylem_PhloemNumber {
	static boolean toCheck(int n) {
		int es=0,ms=0;
		es=es+n%10;
		n=n/10;
		while(n>9) {
			ms=ms+n%10;
			n=n/10;
		}
		es=es+n;
		return es==ms;
	}
	
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=sc.nextInt();  //583=5+3==8
		
		boolean rs=toCheck(n);
		if(rs)
			System.out.println(n+" is Xylem Number");
		else
			System.out.println(n+" is Phloem Number");
}
}
