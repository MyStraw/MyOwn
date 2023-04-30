package 백준;

import java.util.Scanner;

public class _2_1_두수비교 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int A = scn.nextInt();
		int B = scn.nextInt();

		if (-10000 <= A && A <= 10000 && -10000 <= B && B <= 10000) {

			if (A > B) {
				System.out.println(">");
			}

			else if (A < B) {
				System.out.println("<");

			} else {
				System.out.println("==");
			}
		}

	}
}
