package jspider;

import java.util.Scanner;

class LuckeyNumber {
	static int getLuckeyNumber(int dd,int mm,int yy) {
		int sum=0;
		int d1=dd%10;
		int d2=dd/10;
		int d3=mm%10;
		int d4=mm/10;
		sum=sum+d1+d2+d3+d4;
		while(yy>0) {
			int d5=yy%10;
			sum=sum+d5;
			yy=yy/10;
		}
		while(sum>9) {
			int sum1=0;
			
		do {
			int d6=sum%10;
			sum1=sum1+d6;
			sum=sum/10;
		}while(sum>0);
		
		sum=sum1;
		}
		return sum;
	}
   public static void main(String[] args) {
	Scanner sc=new Scanner( System.in);
	System.out.println("Enter a date month year");
	int dd=sc.nextInt();
	int mm=sc.nextInt();
	int yy=sc.nextInt();
	int rs=getLuckeyNumber(dd,mm,yy);
	System.out.println("luckey number is :"+rs);
}
}
