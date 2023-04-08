package practice;

import java.util.Scanner;

public class pass_unpass {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("국어 점수를 입력하세요");
			int kor = sc.nextInt();
			System.out.println("영어 점수를 입력하세요");
			int eng = sc.nextInt();
			System.out.println("수학 점수를 입력하세요");
			int math = sc.nextInt();

			String result;
			int sum = kor + eng + math;
			double avg = sum / 3;

			if (kor < 60 || eng < 60 || math < 60) {
				result = "과락";
			} else if (avg >= 70) {
				result = "통과";
			} else {
				result = "과락";

			}
			System.out.println("입력 : " + kor + ',' + eng + ',' + math + ", " + "총계 : " + sum + ", " + "평균 : "
					+ String.format("%.2f", avg) + " -> " + result);

		}

	}

}
