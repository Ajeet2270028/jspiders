package jspider;
import java.util.*;
class AvgMain {
	static int count(int n) {
		int count1=0;
		do {
			count1++;
			n=n/10;
		}while(n!=0);
		return count1;
	}
	static double avg(int n,int count1) {
		int sum=0;
		do {
			int d=n%10;
			sum=sum+d;
			n=n/10;
		}while(n!=0);
		return sum/count1;
	}
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int c=count(n);
		double rs=avg(n,c);
		System.out.println("Avrage of no:"+rs);
}
}
