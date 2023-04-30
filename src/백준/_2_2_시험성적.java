package 백준;

import java.util.Scanner;

public class _2_2_시험성적 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int A = scn.nextInt();

		if (0 <= A && A <= 100) {
			if (90 <= A && A <= 100) {
				System.out.println("A");
			} else if (80 <= A && A <= 89) {
				System.out.println("B");
			} else if (70 <= A && A <= 79) {
				System.out.println("C");
			} else if (60 <= A && A <= 69) {
				System.out.println("D");
			} else {
				System.out.println("F");

			}
		}
	}
}