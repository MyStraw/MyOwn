package 자바1학년;

import java.util.Random;

public class CalcQuiz {
	
	String question;
	String answer;
	
	
	CalcQuiz(){
		createQuestion();
	}
	
	
	void createQuestion() {
		Random rand = new Random();
		int a = rand.nextInt(100);
		int b = rand.nextInt(100);
		
		question = a + "x" + b + "=";
		answer = Integer.toString(a*b);
			
	}
	
	String getQuestion() {
		return question;
	}
	
	String getAnswer() {
		return answer;
	}
	
	
	
}

	