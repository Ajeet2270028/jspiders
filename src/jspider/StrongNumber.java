package jspider;

import java.util.Scanner;
 
class StrongNumber {
	 static boolean isStrong(int x) {
		  int sum=0,temp=x;
		  do {
			  int d=x%10;
			  sum=sum+fact(d);
			  x=x/10;
		  }while(x!=0);
		  return sum==temp;
	  }
	  
	  static int fact(int x) {
		  int fc=1;
		  while(x>1) {
			  fc=fc*x;
			  x--;
		  }
		  return fc;
	  }
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=sc.nextInt();  //145-->1!+4!+5!-->1+24+120=145
		boolean rs=isStrong(n);
		if(rs)
			System.out.println(n+" is Strong Number");
		else
			System.out.println(n+" is not Strong number");
		
		}
}
