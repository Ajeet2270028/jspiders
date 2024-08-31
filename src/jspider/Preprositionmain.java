package jspider;

import java.util.Scanner;

class Preprositionmain{
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=sc.nextInt();
	
	int eCount=0,oCount=0;
	do {
		int d=n%10;
		if(d%2==0)
			eCount++;
		else 
			oCount++;
		n=n/10;
	}while(n!=0);
	int total=eCount+oCount;
	double even=(eCount*100)/total;
	double odd=(oCount*100)/total;
	System.out.println("preprosation= "+(int)even+":"+(int)odd);
}
}
