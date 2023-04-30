package 백준;

import java.util.Scanner;

public class _2_7_주사위상금 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();

		int sum = 0;

		if (a == b && b == c) {
			sum = 10000 + a * 1000;
			System.out.println(sum);
		} else if (a == b && b != c) {
			sum = 1000 + a * 100;
			System.out.println(sum);
		} else if (a == c && b != c) {
			sum = 1000 + a * 100;
			System.out.println(sum);

		} else if (b == c && a != b) {
			sum = 1000 + b * 100;
			System.out.println(sum);

		} else if (a != b && b != c && a != c) {
			if (a > b && b > c || a > c && c > b) {
				sum = a * 100;
				System.out.println(sum);
			}

			else if (b > a && a > c || b > c && c > a) {
				sum = b * 100;
				System.out.println(sum);
			} else if (c > a && a > b || c > b && b > a) {
				sum = c * 100;
				System.out.println(sum);
			}

		}

	}
}