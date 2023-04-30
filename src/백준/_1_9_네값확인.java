package 백준;
import java.util.Scanner;

public class _1_9_네값확인 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int A = scn.nextInt();
		int B = scn.nextInt();
		int C = scn.nextInt();

		if (2 <= A && A <= 10000 && 2 <= B && B <= 10000 && 2 <= C && C <= 10000) {
			System.out.println((A + B) % C);
			System.out.println(((A % C) + (B % C)) % C);
			System.out.println((A * B) % C);
			System.out.println(((A % C) * (B % C)) % C);

		}

	}

}
