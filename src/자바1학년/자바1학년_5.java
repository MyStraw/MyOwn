package 자바1학년;

import java.util.Random;

public class 자바1학년_5 {
	public static void main(String[] args) {
		
		for (int i = 0; i<=9; i++) {
			System.out.println("5x" + i + "=" + (5*i));
		}
		System.out.println("----------------------");
		
		Random rnd = new Random();
		int answer = rnd.nextInt(10);		
		String question ="";
		
		for (int i = 0; i<=9; i++) {
			question = question + "[" + (answer*i) + "]";
			
		}
		System.out.println("구구단 몇단일까요?");
		System.out.println(question);
		System.out.println("정답: "+ answer);	
		
		
		
	}

}
