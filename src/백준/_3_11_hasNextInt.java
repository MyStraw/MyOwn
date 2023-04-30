package 백준;

import java.util.Scanner;

public class _3_11_hasNextInt {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		while (scn.hasNextInt()) {

			int A = scn.nextInt();
			int B = scn.nextInt();

			if (0 < A && A < 10 && 0 < B && B < 10) {

				System.out.println(A + B);
			}

		}
	}
}