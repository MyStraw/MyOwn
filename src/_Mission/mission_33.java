package _Mission;

import java.util.Scanner;

public class mission_33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("좌표 입력");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("각도 입력");
		int rad = sc.nextInt();

		double sin = Math.sin(Math.toRadians(rad));
		double cos = Math.cos(Math.toRadians(rad));

		double[][] a = { { cos, -sin, 0 }, { sin, cos, 0 }, { 0, 0, 1 } };
		double[][] b = { { x }, { y }, { 1 } };
		double[][] result = new double[a.length][b[0].length];
		
		
		for (int i = 0; i < 3; i++) {		
			for (int j = 0; j < 3; j++) {
				result[i][0] += a[i][j] * b[j][0];
			}
			
		}
		System.out.print("출력 좌표 : "+ Math.round(result[0][0])+ ",  ");
		System.out.print(Math.round(result[1][0]));
	}
}
