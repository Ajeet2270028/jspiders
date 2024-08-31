package assigment;

import java.util.Arrays;

public class ArrayMainSort {
public static void main(String[] args) {
	int ar[]= {45,67,89,34,54,68,76,45,79,23,12};
	int big=Arrays.stream(ar)
			.boxed()
			.distinct()
			.sorted((a,b)->b-a)
			.skip(2)            //skip last two element
			.findFirst().get();
	System.out.println(big);
}
}
