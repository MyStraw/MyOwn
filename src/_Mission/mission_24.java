package _Mission;

import java.util.Scanner;

public class mission_24 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int count = 0;

		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				for (int z = 1; z <= 10; z++) {
					if (2 * x + 3 * y + 5 * z == n) {
						System.out.print("(" + x + "," + y + "," + z + ")" + " ");
						count += 1;
					}

				}

			}

		}
		System.out.println("\n" + "총 : " + count + "개");
	}

}
