package 백준;

import java.util.Scanner;

public class _1_10_나눗셈 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int A = scn.nextInt();
		int B = scn.nextInt();
		int C = B % 10;
		int D = (B % 100) / 10;
		int E = B / 100;

		System.out.println(A * C);
		System.out.println(A * D);
		System.out.println(A * E);
		System.out.println(A * B);
	}

}
