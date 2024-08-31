package pattern;

import java.util.Scanner;

class Square2211 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();

		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
