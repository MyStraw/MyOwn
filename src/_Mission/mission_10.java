package _Mission;

import java.util.Scanner;

public class mission_10 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int won = sc.nextInt();

		int[] cash = { 50000, 10000, 5000, 1000 };
		int quota = 0;
		int rest = 0;

		for (int i = 0; i < cash.length; i++) {
			quota = won / cash[i];
			System.out.println(cash[i] + "짜리" + quota + "필요해");

			rest = won % cash[i];
			won = rest;

		}

	}

}
