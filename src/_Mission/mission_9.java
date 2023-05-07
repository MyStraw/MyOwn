package _Mission;

import java.util.Scanner;

public class mission_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		
		double a = 9.81;
		
		double x = 1000 - (a*t*t)/2;
		
		System.out.println(x);
	}

}
