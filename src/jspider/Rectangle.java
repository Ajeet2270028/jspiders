package jspider;
import java.util.*;
class Rectangle {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter length and breath of rectangle");
	double l=sc.nextDouble();
	double b=sc.nextDouble();
	double area=l*b;
	double perameter=2*(l+b);
	System.out.println("area of rectangle: "+area);
	System.out.println("perameter of ractangle: "+perameter);
}
}
