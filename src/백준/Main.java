package 백준;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int n[] = new int[N];
		int M = sc.nextInt();

		if (1 <= N && N <= 100 && 1 <= M && M <= 100) {

			for (int x : n) {
				n[x] = 0;
			}

			for (int I = 0; I < M; I++) {

				int i = sc.nextInt();
				int j = sc.nextInt();
				int k = sc.nextInt();

				if (1 <= i && i <= j && j <= N && 1 <= k && k <= N) {
					n[i - 1] = k;
					n[j - 1] = k;
					for (int J = i; J < j; J++) {
						if (i < j) {
							n[i] = k;
							i += 1;
						}
					}
				}
			}
			for (int i = 0; i < N; i++) {
				System.out.print(n[i] + " ");
			}
		}
	}
}
