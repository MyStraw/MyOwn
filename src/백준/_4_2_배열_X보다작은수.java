package 백준;

import java.util.Scanner;

public class _4_2_배열_X보다작은수 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int X = sc.nextInt();

		int[] A = new int[N];

		if (1 <= N && N <= 10000 && 1 <= X && X <= 10000) {

			for (int i = 0; i < N; i++) {
				A[i] = sc.nextInt();
			}

			for (int a : A) {
				if (X > a) {
					System.out.print(a + " ");
				}
			}

		}

	}

}
