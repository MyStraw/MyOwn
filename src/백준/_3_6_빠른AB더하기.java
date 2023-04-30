package 백준;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class _3_6_빠른AB더하기 {
	public static void main(String[] args) {


		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		int sum = 0;

		if (1 <= T && T <= 1_000_000) {
			for (int i = 1; i <= T; i++) {
				int A = scn.nextInt();
				int B = scn.nextInt();
				if (1 <= A && A <= 1000 && 1 <= B && B <= 1000) {
					sum = A + B;
					System.out.println(sum);

				}
			}
		}
	}
}
