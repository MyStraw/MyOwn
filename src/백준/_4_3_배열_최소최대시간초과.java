package 백준;

import java.util.Scanner;

public class _4_3_배열_최소최대시간초과 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] B = new int[N];

		int max = -1_000_000;

		int min = 1_000_000;

		if (1 <= N && N <= 1_000_000) {
			for (int i = 0; i < N; i++) {
				if (-1_000_000 <= B[i] && B[i] <= 1_000_000) {
					B[i] = sc.nextInt();
										// 그전에 여기에 if (int b:B)로 루프를 또돌았고
										// max=b 로했는데, 그럴 이유가 없네. 위의 루프를 이용하면 되잖아
					if (B[i] > max) {
						max = B[i];
					}
					if (B[i] < min) { //else if를 쓰면 안돼
						min = B[i];
					}

				}
			}

		}
		System.out.println(min + " " + max);
	}
}
