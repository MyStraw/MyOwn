package 백준;

import java.util.Scanner;

public class _3_4_영수증 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int X = scn.nextInt();
		int N = scn.nextInt();
		int sum = 0;

		if (1 <= X && X <= 1_000_000_000 && 1 <= N && N <= 100)

		{
			for (int i = 0; i < N; i++) {
				int a = scn.nextInt();
				int b = scn.nextInt();
				if (1 <= a && a <= 1_000_000 && 1 <= b && b <= 10) {
					sum = sum + (a * b);
				}
			}
			if (sum == X) {
				System.out.println("Yes");

			} else {
				System.out.println("No");
			}
		}
	}
}
