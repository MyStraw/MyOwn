package 백준;

import java.util.Scanner;

public class _1_7_아이디중복 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String A = scn.next();
		A = A.toLowerCase();

		if (A.length() <= 50) {
			System.out.println(A + "??!");
		}

	}

}
