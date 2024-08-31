package jspider;
class Mobile {
  String brand;
  double cost;
   Mobile(String brand,double cost){
	   this.brand=brand;
	   this.cost=cost;
   }
   void display() {
	   System.out.println("Mobile Name is "+brand+" and cost is "+cost);
   }
   public static void main(String[] args) {
	Mobile m1=new Mobile("Samsung",12000);
	Mobile m2=new Mobile("Apple",125000.0);
	m1.display();
	m2.display();
	
//	System.out.println("Mobile Name is "+m1.brand+" and cost is "+m1.cost);
//	System.out.println("Mobile Name is "+m2.brand+" and cost is "+m2.cost);
 }
}
