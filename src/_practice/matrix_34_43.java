package _practice;

// 3*4 행렬과 4*3 행렬을 선언하고 두 행렬의 곱을 계산해서 출력
public class matrix_34_43 {
	public static void main(String[] args) {
		
		int[][] matrix1 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		int[][] matrix2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };

		int[][] result = new int[matrix1.length][matrix2[0].length];

		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix2[0].length; j++) {
				for (int k = 0; k < matrix2.length; k++) {
					result[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}

		// 결과값 출력
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
}
