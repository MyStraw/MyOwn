package 백준;

import java.util.Scanner;

public class _4_3_배열_최소최대시간초과MathMax {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] B = new int[N];

		int max = -1_000_000;

		int min = 1_000_000;

		if (1 <= N && N <= 1_000_000) {
			for (int i = 0; i < N; i++) {
				if (-1_000_000 <= B[i] && B[i] <= 1_000_000) {
					B[i] = sc.nextInt();
					max = Math.max(max, B[i]);
					min = Math.min(min, B[i]);
				}

			}

		}
		System.out.println(min + " " + max);
	}
}
