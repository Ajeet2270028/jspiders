package string;

import java.util.Scanner;

public class IntegerIntoWords {
	static void convertWord(int n,String st) {
		//String rs="";
		if(n==0)
			return;
		String x[]= {" ","One","Two","Three","Four","Five","Six","Seven","Eight","Nine",
				"Ten","Eleven","Twelven","Thirteen","Fourteen","fiveteen",
				"Sixteen","Seventeen","Eighteen","Nineteen"};
		String y[]= {" "," ","Twenty","Thirty","Fourty","Fivety","Sixty","Seventy",
				"Eighty","Ninety"};
		
	if(n<20) {
		System.out.print(x[n]+st+" ");
	}
	else {
		System.out.print(y[n/10]+x[n%10]+st+" ");
	}
		
		
				
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		convertWord(n/10000000,"Crore");
		convertWord(n/100000%100,"lakh");
		convertWord(n/1000%100,"thousand");
		convertWord(n/100%10,"hundred");
		convertWord(n%100," ");
	}
}
