package _practice;

public class _01_matArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int n = 2;

		int[][] mat = convertArrayToMatrix(arr, n);

		// 변환된 2차원 배열 출력
		for (int i = 0; i < n * 2 - 1; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] convertArrayToMatrix(int[] arr, int n) {
		int[][] mat = new int[n * 2 - 1][n];
		for (int i = 0; i < n * 2 - 1; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = arr[n * i + j];
			}
		}
		return mat;
	}
}