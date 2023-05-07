package _Mission;

import java.util.Scanner;

public class mission_24_2 {
	public static void main(String[] args) {

		for (int n = 10; n <= 100; n++) {
			System.out.println("-----------" + n + "g" + "을 만들려면------------\n");
			int count = 0;
			for (int x = 1; x <= 10; x++) {
				for (int y = 1; y <= 10; y++) {
					for (int z = 1; z <= 10; z++) {
						if (2 * x + 3 * y + 5 * z == n) {
							System.out.print("(" + x + "," + y + "," + z + ")" + " ");
							count += 1;
						} else if (2 * x + 3 * y + 5 * z != n) {
							continue;
						}

					}

				}

			}
			if (count != 0) {
				System.out.println("\n" + "총 : " + count + "개\n");
			} else {
				System.out.println("불가능\n");
			}
		}
	}

}
