package 백준;

import java.util.Scanner;

public class _3_4_1부터n까지합 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int sum = 0;

		if (1 <= n && n <= 10000) {
			for (int i = 0; i <= n; i++) {
				sum += i;
			}
		}
		System.out.println(sum);

	}

}
