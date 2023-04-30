package 백준;

import java.util.Scanner;

public class _2_3_윤년 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int A = scn.nextInt();

		if (1 <= A && A <= 4000) {
			if (A % 4 == 0 && A % 100 != 0 || A % 400 == 0) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}

		}

	}
}