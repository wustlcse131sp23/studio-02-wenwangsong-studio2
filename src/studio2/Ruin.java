package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double startAmount = in.nextDouble();
		double a = startAmount;
		double winChance = in.nextDouble();
		double winLimit = in.nextDouble();
		int totalSimulations = in.nextInt();
		int winTimes = 0;
		int loseTimes = 0;
		double b = (1 - winChance)/winChance;
		for (int i = 1; i <= totalSimulations; i++) {
			while ( a > 0 && a < winLimit) {
				if (Math.random() > winChance) {
					a --;
				} else {
					a ++;
				}
			}
			if (a == winLimit){
				System.out.println("You succeed day" + i);
			} else {
				System.out.println("You ruin day" + i);
				loseTimes ++;
			}
			a = startAmount;
		}
		System.out.println("The ruin rate is " + (double)(loseTimes) / totalSimulations);
		if (winChance == 0.5) {
			System.out.println(1 - startAmount/winLimit);
		}
		else System.out.println("The expected ruin rate is" + (Math.pow(b, startAmount) - Math.pow(b, winLimit)) / (1 - Math.pow(b,  winLimit)));
	}

}
