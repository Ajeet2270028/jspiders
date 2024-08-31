package jspider;
import java.util.*;
class SimpleInterest {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter princpal rate time :");
	double p=sc.nextDouble();
	double r=sc.nextDouble();
	double t=sc.nextDouble();
	double sI=(p*r*t)/100;
	
	System.out.println("simple Interset: "+sI);
}
}
