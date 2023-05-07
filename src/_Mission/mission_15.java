package _Mission;

import java.util.Scanner;

public class mission_15 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int N = n;
		int quota = 0;
		int rest = 0;
		int count = 0;

		while (n > 0) {
			rest = n % 2;
			quota = n / 2;
			n = quota;
			count += 1; //와일 쓰쟝
		}

		int by[] = new int[count];

		for (int i = 0; i < count; i++) {
			if (N > 0) {
				rest = N % 2;
				quota = N / 2;
				N = quota;
				by[count - i - 1] = rest;
			}
		}
		for (int i : by) {
			System.out.print(i);
		}

	}

}
