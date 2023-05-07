package _Mission;

import java.util.Scanner;

public class mission_17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int a = 10_000_000;
		
		double r = 0.03;
		
		double S = a;
		
		for (int i = 0; i<n ; i++) {
			S = S*(1+r);
		}
		System.out.println((int)S+"원");
	}
}
