package jspider;
import java.util.*;
class ConvertLength {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter length:");
	double length=sc.nextDouble();
	
	double convertFoot=length/30.48;
	 System.out.println("length cm to convert foot "+length+" CM ---> "+convertFoot+" Foot");
	 
}
}
