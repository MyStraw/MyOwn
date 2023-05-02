package 백준;

import java.util.Scanner;

public class _4_5_배열_최댓값 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] natural = new int[9];

		int max = 0;
		int count = 0;

		for (int i = 0; i < natural.length; i++) {
			int a = sc.nextInt();
			natural[i] = a;
			if (max < natural[i]) {
				max = natural[i];
				count = i + 1;
			}

		}
		System.out.println(max);
		System.out.println(count);

	}

}
