package _practice;

import java.util.Arrays;

public class _02_matArray2 {

	// 금요일 과제
	public static void main(String[] args) {
		int[] ar1 = { 10, 20, 30 };
		int[] ar2 = { 50, 60, 70, 80 };

		int[] ar3 = concatArr(ar1, ar2); // 2개의 배열 합치기 : ar1뒤에 ar2이 붙게 만듦.
		int[][] ar4 = mkArr(ar1, ar2); // 2개의 배열을 2차원 배열로 만들기

		printArr(ar3);
		printArr(ar4);

	} // main

	static int[] concatArr(int[] a, int[] b) {
		int[] result = new int[a.length + b.length];

		for (int i = 0; i < a.length + b.length; i++) {
			if (i < a.length) {
				result[i] = a[i];
			} else {
				result[i] = b[i - a.length];
			}
		} // for
		return result;
	}

	static int[][] mkArr(int[] a, int[] b) {

		int[][] result = { a, b };
		return result;
	}

	static void printArr(int[] a) {
		System.out.println("1차원배열>>>");
		System.out.println(Arrays.toString(a));
	} // printArr() : 1차원 배열

	static void printArr(int[][] a) {
		System.out.println("2차원배열>>>");
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		} // for문 - 배열의 행부분만 출력하면 한줄 씩 나오니까.

	} // printArr() : 2차원 배열

}
