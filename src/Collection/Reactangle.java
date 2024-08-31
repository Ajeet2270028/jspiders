package Collection;

public class Reactangle implements Shap {
 double length;
 double breath;
Reactangle(double length, double breath) {

	this.length = length;
	this.breath = breath;
}
double area;
@Override
public double getArea() {
	area=length*breath;
	return area;
}
@Override
public String toString() {
	return "Reactangle [length=" + length + ", breath=" + breath +"area="+area+ "]";
}
}
