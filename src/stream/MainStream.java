package stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainStream {
	static List getEvens(List<Integer> list)
	{
//		List<Integer> l=new ArrayList<Integer>();
//	   	for(Integer i:list) {
//	   		if(i%2==0)
//	   			l.add(i);
//	   	}
//	   	return l;
//		
//		Stream<Integer> stream=list.stream();//list to Stream
//		Stream<Integer> fstream=stream.filter(n->n%2==0);//intermidiate operation to filter
//		List<Integer> evens=fstream.collect(Collectors.toList());
//		return evens;
		
		//reducing Code
//		List<Integer> evens=list.stream()
//				                .filter(n->n%2==0)
//				                .collect(Collectors.toList());
//		return evens;
		
		return list.stream()
				   .filter(n->n%2==0)
				   .collect(Collectors.toList());
	}
public static void main(String[] args) {
	List<Integer> list=new ArrayList<Integer>();
	list.add(10);
	list.add(11);
	list.add(12);
	list.add(14);
	list.add(16);
	list.add(17);
	list.add(19);
	list.add(23);
	
	List<Integer> even=getEvens(list);
	even.forEach(System.out::println);
	
}
}
