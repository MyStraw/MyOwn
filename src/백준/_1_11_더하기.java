package 백준;

import java.util.Scanner;

public class _1_11_더하기 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		long A = scn.nextLong();
		long B = scn.nextLong();
		long C = scn.nextLong();

		if (1 <= A && A <= 1_000_000_000_000l && 1 <= B && B <= 1000000000000l && 1 <= C && C <= 1000000000000l) {

			System.out.println(A + B + C);

		}

	}

}
