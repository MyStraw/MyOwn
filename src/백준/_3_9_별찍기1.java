package 백준;

import java.util.Scanner;

public class _3_9_별찍기1 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int N = scn.nextInt();

		if (1 <= N && N <= 100) {
			for (int i = 1; i <= N; i++) {

				for (int k = 1; k < i; k++) {
					System.out.print("*");
				}
				System.out.println("*");

			}

		}
	}

}
