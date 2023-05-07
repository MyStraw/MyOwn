package _Mission;

import java.util.Scanner;

public class mission_21 {

	static void gugudan(int n) {
		int sum = 0;
		for (int i = 1; i <= 9; i++) {
			sum = n * i;
			System.out.println(n + "*" + i + "=" + sum);
		}
	}

	private void multi(int n) {
		int sum = 0;
		for (int i = 1; i <= 9; i++) {
			sum = n * i;
			System.out.println(n + "*" + i + "=" + sum);
		}
	}

	public static void main(String[] args) {
		mission_21 gg = new mission_21();
		gg.multi(2);
		System.out.println();
		gugudan(3);
		System.out.println();
		gg.multi(4);
	}
}
