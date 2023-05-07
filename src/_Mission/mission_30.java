package _Mission;

import java.util.Scanner;

public class mission_30 {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();

	void factorial() {
		int fact = 1;

		for (int i = 1; i <= n; i++) {
			fact *= i;
		}

		for (int i = n; i >= 2; i--) {
			System.out.print(i + " * ");
		}
		System.out.print("1 = ");
		System.out.println(fact);

	}

	public static void main(String[] args) {
		mission_30 m = new mission_30();
		m.factorial();
	}
}
