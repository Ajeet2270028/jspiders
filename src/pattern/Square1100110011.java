package pattern;

import java.util.Scanner;

class Square1100110011 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();

		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(i%2+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
