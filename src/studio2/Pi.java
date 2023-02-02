package studio2;

import java.util.Scanner;

public class Pi {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double x = (Math.random() - 1/2);
		double y = (Math.random() - 1/2);
		int dartThrow = in.nextInt();
		int a = 0;
		for (int i=0; i <= dartThrow; i++) {
			if ((x * x + y * y) <= 1/4) {
				a++; 
			}
		}
		System.out.println((double)(a)/(double)(dartThrow));
	}

}
