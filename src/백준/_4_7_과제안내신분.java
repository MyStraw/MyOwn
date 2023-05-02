package 백준;

import java.util.Scanner;

public class _4_7_과제안내신분 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] N = new int[28];
		int[] M = new int[30];
		int[] Ab = new int[30];

		int min = 99;
		int max = 0;

		for (int i = 0; i < 28; i++) {
			int n = sc.nextInt();
			N[i] = n;
		}

		for (int i = 0; i < 30; i++) {
			M[i] = i + 1;

		}

		for (int i = 0; i < 28; i++) {
			for (int j = 0; j < 30; j++) {
				if (N[i] == M[j]) {
					Ab[j] = M[j];
				}
			}
		}
		for (int i = 0; i < 30; i++) {
			if (Ab[i] == 0) { // int 배열에 아무것도 안들어간 자리는 0이 되는걸 이용
				if (max < M[i]) {
					max = M[i];
				}

				if (min > M[i]) {
					min = M[i];
				}
			}

		}
		System.out.println(min);
		System.out.println(max);
	}
}
