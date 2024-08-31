package jspider;
import java.util.*;
class ArmstrongNo {
	static int countValue(int n) {
		int count=0;
		do {
			count++;
			n=n/10;
		}while(n!=0);
		return count;
	}
	static int pow(int p,int n) {
		int product=1;
		while(n>0){
			product=product*p;
			n--;
		}
		return product;
	}
	static boolean armStrong(int n) {
		int c=countValue(n);
		int temp=n;
		int sum=0;
		do {
			int d=n%10;
			sum=sum+pow(d,c);
			n=n/10;
		}while(n!=0);
		return sum==temp;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=sc.nextInt();
	boolean res=armStrong(n);
	
	
	if(res)
		System.out.println("ArmStrong Number");
	else
		System.out.println("Not ArmStrong Number");
}
}
