package 백준;

import java.util.Scanner;

public class _3_5_longint {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int N = scn.nextInt();

		if (4 <= N && N <= 1000 && N % 4 == 0) {

			for (int i = 0; i < N / 4; i++) {

				System.out.print("long ");

			}
			System.out.println("int");

		}

	}
}
