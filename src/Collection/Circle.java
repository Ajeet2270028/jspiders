package Collection;

public class Circle implements Shap {
	double radius;
 Circle( double radius){
	 this.radius=radius;
 }
@Override
public double getArea() {
//3.14*radius*radius;
	return 3.14*radius*radius;
}
@Override
public String toString() {
	return "Circle [area=" + getArea() + "]";
}
 
}
