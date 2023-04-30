package 백준;

import java.util.Scanner;

public class _3_8_AB더하기2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int T = scn.nextInt();
		int sum = 0;

		for (int i = 1; i <= T; i++) {
			int A = scn.nextInt();
			int B = scn.nextInt();
			if (0 < A && A < 10 && 0 < B && B < 10) {
				sum = A + B;
			}	System.out.println("Case #" +i+": "+ A + " + "+ B +" = "+sum);
		}
	

	}
}
