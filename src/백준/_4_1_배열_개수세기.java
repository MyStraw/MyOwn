package 백준;

import java.util.Scanner;

public class _4_1_배열_개수세기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] a = new int[N];

		int sum = 0;

		if (1 <= N && N <= 100) {
			for (int i = 0; i < N; i++) {
				a[i] = sc.nextInt();
			}
			int v = sc.nextInt();
			for (int A : a) {
				if (A == v) {
					sum += 1;
				}
			}
			System.out.println(sum);
		}

	}
}