package _Mission;

import java.util.Scanner;

public class mission_31 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 입력");
		int n = sc.nextInt();

		int[] F = new int[n];

		F[0] = 0;
		F[1] = 1;

		System.out.print("출력 : ");

		for (int i = 0; i < n - 2; i++) {
			F[i + 2] = F[i] + F[i + 1];
		}

		for (int i = 0; i < n; i++) {
			if (i < n - 1) {
				System.out.print(F[i] + ", ");
			} else {
				System.out.println(F[i]);
			}
		}

	}
}
