package _Mission;

import java.util.Scanner;

public class mission_16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("작은수를 먼저 입력하세요");
		int min = sc.nextInt();
		int max = sc.nextInt();

		if (max > min) {
			int rem = max % min;

			if (rem == 0) {
				System.out.println("최대공약수 = " + min);
				System.out.println("최소공배수 = " + (min * max) / min);
			} else {
				
				for (int i = 1; i <= max; i++) {
					for (int j = 1; j <= max; j++) {
						if (i * min == max * j) {							
							System.out.println("최소공배수 = " + max * j);						
							return;

						}

					}

				}

			}
		}

		else {
			System.out.println("아니쟈냐");
		}
	}
}
