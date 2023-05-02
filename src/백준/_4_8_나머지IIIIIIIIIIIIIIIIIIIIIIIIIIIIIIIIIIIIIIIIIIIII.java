package 백준;

import java.util.Scanner;

public class _4_8_나머지IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A[] = new int[10];
		int remainder[] = new int[10];
//			int remainder2[] = new int[10];
//			int count[] = new int[10];
		int counter[] = new int[42];

		int sum = 0;

		for (int i = 0; i < 10; i++) {
			A[i] = sc.nextInt();
			remainder[i] = A[i] % 42;

		}

		for (int i = 0; i < 10; i++) { // 배열 안에 배열을 넣는게 핵심이었다. 이건 몰랐을거다 그냥 머리로는.
			counter[remainder[i]] += 1;
		}

		for (int i = 0; i < 42; i++) {
			if (counter[i] != 0) {
				sum += 1;
			}
		}

//			for (int i = 0; i < 10; i++) {
//				for (int j = 0; j < 10; j++) {
//					if (i != j && remainder[i] == remainder[j]) {
//						remainder2[j] = remainder[j];
//					}
//				}
//			}
		//
//			for (int j = 1; j < 42; j++) {
//				for (int i = 0; i < 10; i++) {
//					if (j == remainder2[i]) {
//						count[i] = j;
//					}
//				}
//			}
		//
//			for (int i = 0; i < 10; i++) {
//				if (count[i] != 0) {
//					sum += 1;
//				}
//			}

		System.out.println(sum);
	}

}