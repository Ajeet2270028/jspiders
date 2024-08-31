package stream;

import java.util.stream.IntStream;

public class IntStreamFile {


		public static void main(String[] args) {
			//IntStream.range(0,10).forEach(System.out::println);
			
			//print even no
			//IntStream.range(0,100).filter(n->n%2==0).forEach(System.out::println);
			//print prime no
		long l=	IntStream.range(0,100).filter(
					n->{
						if(n==0||n==1)
							return false;
						for(int i=2;i<=n/2;i++) {
							if(n%i==0)
								return false;
						}
						return true;
					}
					).count();
		System.out.println("Total prime no:"+l);
		IntStream.range(0,100).filter(
				n->{
					if(n==0||n==1)
						return false;
					for(int i=2;i<=n/2;i++) {
						if(n%i==0)
							return false;
					}
					return true;
				}
				).forEach(System.out::println);
		
		System.out.println("Print Prefect no 1 to 100");
		IntStream.range(1, 100).filter(n->{
			int sum=0;
			for(int i=1;i<=n/2;i++) {
				if(n%i==0) {
					sum=sum+i;
				}
			}
			return sum==n/2;
		}).forEach(System.out::println);
		
			
		}	
	}

