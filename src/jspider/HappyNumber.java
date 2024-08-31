package jspider;

import java.util.Scanner;

class HappyNumber {
	static boolean isHappyNumber(int x) {
		
		while(x>9) {
			int sum=0;
			do {
				int d=x%10;
				sum=sum+d*d;
				x=x/10;
			}while(x!=0);
			x=sum;
		}
		return x==1 ||x==7;
	}
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=sc.nextInt();                          //49->4^2+9^2=16+81=97
								                     //->9^2+7^2=81+49=130
		boolean res=isHappyNumber(n);                 //->130=1^2+3^2+0^2=10
	    if(res)	                                      //->10=1^2+0^2=1
	    	System.out.println(n+" is Happy Number");
	    else
	    	System.out.println(n+" is Not happy Number");
	    	
	    	
}          
}
