package _Alsong;

import java.util.Scanner;

public class _7_1 {	
	//n의 부호판정	
	static int signOf(int n ) {
		int sign = 0;
		
		if (n>0)
			sign = 1;
		else if (n<0)
			sign = -1;
		
		return sign; //sign 값 반환		
	}
	
	static int signOf2(int n) { //위에거랑 같다. 리턴은 여러개 있어도 돼.
		
		if (n>0)
			return 1;
		
		else if (n<0)
			return -1;
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 x: ");
		int x = sc.nextInt();
		
		int s = signOf(x);
		System.out.println("signOf(x)는 " + s+ "입니다.");				
	}
}
