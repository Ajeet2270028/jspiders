package stream;

import java.util.Arrays;
import java.util.stream.LongStream;

public class StreamMain4 {
public static void main(String[] args) {
	int ar[]= {23,45,56,78,37,12,44};
	int sumOfArray=Arrays.stream(ar).sum();
	System.out.println("Sum of number in array "+sumOfArray);
	
	int max=Arrays.stream(ar).max().getAsInt();
	System.out.println("Max no Array "+max);
	
	int min =Arrays.stream(ar).min().getAsInt();
	System.out.println("Min no Of Array "+min);
	
	long product=Arrays.stream(ar).reduce(1, (a,b)->a*b);
	System.out.println(product);
	
	long fact=LongStream.rangeClosed(1,5).reduce(1,(a,b)->a*b);
	System.out.println(fact);
	
	long product1=LongStream.rangeClosed(1,10).filter(x->x%2==0).reduce(1,(a,b)->a*b);
	System.out.println(product1);
	
	//Convert Array to String
	String st=Arrays.stream(ar).mapToObj(String::valueOf).reduce(" ",(a,b)->a+b);
	System.out.println(st);
	
	//Convert Even number as 0 and remaining as it is in array
	ar=Arrays.stream(ar).map(x->x%2==0?0:x).toArray();
	System.out.println(Arrays.toString(ar));
	
	//count how many prime no in the array
	long rs=Arrays.stream(ar).filter(n->{
		if(n==1||n==0)
			return false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}).count();
	System.out.println(rs);
	
}
}
