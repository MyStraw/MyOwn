package 백준;

import java.util.Scanner;

public class _3_3_반복문더하기 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int T = scn.nextInt();
		int sum = 0;

		for (int i = 1; i <= T; i++) {
			int A = scn.nextInt();
			int B = scn.nextInt();
			sum = A + B;
			System.out.println(sum);
		}

	}
}