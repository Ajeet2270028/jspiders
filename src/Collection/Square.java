package Collection;

public class Square implements Shap {
   double side;
   Square(double side){
	   this.side=side;
   }
   @Override
   public double getArea() {
	  // double area=side*side;
	   return side*side;
   }
@Override
public String toString() {
	return "Square [area=" + getArea() + "]";
}
}
