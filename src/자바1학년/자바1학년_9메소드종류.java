package 자바1학년;

import java.util.Random;

public class 자바1학년_9메소드종류 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++)
			makeQuestion();

	}

	static void makeQuestion() {
		Random rand = new Random();
		int a = rand.nextInt(100);
		int b = rand.nextInt(100);
		String question = a + "x" + b + " = ?";
		System.out.println(question);
	}

}
