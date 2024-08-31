package pattern;

import javax.annotation.processing.SupportedSourceVersion;

public class Pattern {
   public static void main(String[] args) {
	int n=5;
//	for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n-i;j++) {
//				System.out.print("  ");
//			}
//			for(int j=1;j<=2*i-1;j++) {
//				System.out.print(i+" ");
//				if(j<=i)
//					i--;
//				else
//					i++;
//			}
//			System.out.println();
//	}
	
//	for(int i=n;i>=1;i--) {
//		for(int j=1;j<=n-i;j++) {
//		    System.out.print("  ");
//		    
//		}
//		for(int j=n-i+1;j<=n;j++) {
//			System.out.print(j+" ");
//		}
//		System.out.println();
//	}
	
	int x=1;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n-i;j++) {
			System.out.print("  ");
			
		}
		for(int j=1;j<=i;j++) {
			System.out.print((char)(64+x)+" ");
			x++;
		}
		System.out.println();
	}
	
	
}
}

