package 백준;

import java.util.Scanner;

public class _2_4_사분면 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int x = scn.nextInt();
		int y = scn.nextInt();

		if (-1000 <= x && x <= 1000 && x != 0 && -1000 <= y && y <= 1000 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("1");
			} else if (x < 0 && y > 0) {
				System.out.println("2");
			} else if (x < 0 && y < 0) {
				System.out.println("3");
			} else if (x > 0 && y < 0) {
				System.out.println("4");
			}

		}

	}
}