package _practice;

public class matrix_34_43_prac {

	public static void main(String[] args) {

		int[][] a = { { 1, 1, 1, 1 }, { 2, 2, 2, 2 }, { 3, 3, 3, 3 } };
		int[][] b = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 }, { 4, 4, 4 } };

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int sum = 0;
				for (int k = 0; k < 4; k++) {
					sum += a[i][k] * b[k][j];
				}

				System.out.print(sum + "\t");
			}
			System.out.println();

		}

	}

}
