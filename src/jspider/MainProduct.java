package jspider;
import java.util.*;
public class MainProduct {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter three product Name And Price:");
	 String pName1=sc.next();
	 double pPrice1=sc.nextDouble();
//	 double drate1=sc.nextDouble();
	 
	 String pName2=sc.next();
	 double pPrice2=sc.nextDouble();
//	 double drate2=sc.nextDouble();
	 
	 String pName3=sc.next();
	 double pPrice3=sc.nextDouble();
//	 double drate3=sc.nextDouble();
	 double dist1=0.0;
	 double dist2=0.0;
	 double dist3=0.0;
	  if(pPrice1>9999)
		  dist1=pPrice1*0.08;
	  if(pPrice2>9999)
		  dist2=pPrice2*0.08;
	  if(pPrice3>9999)
		  dist3=pPrice3*0.08;
	 
//	 double disPrice1 =pPrice1-dist1;
	 double finalPrice1=pPrice1-dist1;
	 
//	 double disPrice2 =pPrice2-dist2;
	 double finalPrice2=pPrice1-dist2;
	 
//	 double disPrice3 =pPrice3-dist3;
	 double finalPrice3=pPrice3-dist3;
	 
	 double netPrice=finalPrice1+finalPrice2+finalPrice3;
	 double tDist=dist1+dist2+dist3;
	 double tAmout=pPrice1+pPrice2+pPrice3;
	 
	 System.out.println("Product Name"+" "+"MRP"+" "+"Discount"+" "+"Final Price");
	 System.out.println(pName1+"        "+pPrice1+"   "+dist1+"  "+finalPrice1);
	 System.out.println(pName2+"        "+pPrice2+"   "+dist2+"  "+finalPrice2);
	 System.out.println(pName3+"        "+pPrice3+"   "+dist3+"  "+finalPrice3);
	 System.out.println("_______________________________________________________");
	 System.out.println("               "+tAmout+"     "+tDist+"     "+netPrice);
	 
	 System.out.println("-------------------------------------------------------");
	 System.out.println("Total Amount  "+tAmout);
	 System.out.println("Total Discount "+tDist);
	 System.out.println("Net Amount  "+netPrice);
	 
}
}
