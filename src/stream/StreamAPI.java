package stream;

import java.util.Arrays;
import java.util.*;

public class StreamAPI {
	static long countEven(List<Integer> list) {
		return list.stream()
				   .filter(n->n%2==0)
				   .count();//count return long value return type is long
	}
public static void main(String[] args) {
	List<Integer> numbers=Arrays.asList(45,23,45,67,89,34,12,21,44,67,55,33);
	List<Integer> numbers1=List.of(45,23,45,67,89,34,12,21,44,67,55,33);
	//upper both method can convert a group of data into list
	System.out.println("no of even numbers "+countEven(numbers));
}
}
