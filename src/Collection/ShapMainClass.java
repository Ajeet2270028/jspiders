package Collection;

import java.util.*;

public class ShapMainClass {
	
	static Shap getHighestArea(List<Shap> shap) {
		Shap highestArea=shap.get(0);
		for(int i=1;i<shap.size();i++) {
			if(shap.get(i).getArea()>highestArea.getArea()) {
				highestArea=shap.get(i);
			}
		}
		return highestArea;
	}
public static void main(String[] args) {
	List<Shap> shap=new ArrayList<Shap>();
	shap.add(new Circle(53));
	shap.add(new Square(32));
	shap.add(new Circle(21));
	shap.add(new Reactangle(13,24));
	shap.add(new Square(23));
	System.out.println("Highest Area");
	Shap hs=getHighestArea(shap);
	System.out.println(hs);
	
}
}
