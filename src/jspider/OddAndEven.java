package jspider;
import java.util.*;
public class OddAndEven 
{
  public static void main(String[] args) 
  {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	if(n%2==0)
		System.out.println("even no="+n);
	if(n%2!=0)
	  System.out.println("odd no="+n);
  }
}
