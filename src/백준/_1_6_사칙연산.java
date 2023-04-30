package 백준;

import java.util.*;

public class _1_6_사칙연산 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B;

		
		A = sc.nextInt();
		
		B = sc.nextInt();

		if (A >= 1 && A <= 10000 && B >= 1 && B <= 10000) {
			System.out.println(A + B);
			System.out.println(A - B);
			System.out.println(A * B);
			System.out.println(A / B);
			System.out.println(A % B);
		}

	}

}
