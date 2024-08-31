package jspider;
import java.util.*;
public class BTM {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter length and weigth of human body: ");
	double l=sc.nextDouble();
	double w=sc.nextDouble();
	
	double convertBtm=w/(l*l);
	System.out.println("BTM: "+convertBtm);
	
}
}
