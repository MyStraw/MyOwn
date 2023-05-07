package _Mission;

import java.util.Scanner;

public class mission_12 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int sum = 0;

		int even = 0;

		for (int i = 1; i <= n; i++) {
			sum = sum + i;

		}

		for (int i = 2; i <= n; i = i + 2) {
			even = even + i;
		}
		int odd = sum - even;

		System.out.println("총 합 : " + sum);
		System.out.println("홀수 합 : " + odd);
		System.out.println("짝수 합 : " + even);

	}

}
