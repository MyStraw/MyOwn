package 백준;

import java.util.Scanner;

public class _3_1_구구단 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int N = scn.nextInt();

		int sum = 0;

		if (1 <= N && N <= 9) {
			for (int i = 1; i < 10; i++) {
				sum = N * i;
				System.out.println(N + " * " + i + " = " + sum);

			}
		}

	}
}