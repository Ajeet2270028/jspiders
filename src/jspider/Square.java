package jspider;
import java.util.*;
public class Square {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter side of square:");
	double side=sc.nextDouble();
	double area=side*side;
	double perameter=4*side;
	
	System.out.println("Area of square: "+area);
	System.out.println("perameter of square: "+perameter);
	
}
  
}
