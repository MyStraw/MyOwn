package 자바1학년;

public class MainCalc {
	public static void main(String[] args) {// 메인에서는 부르고 싶은 클래스 부르고
		// 그 클래스의 인스턴스 적고. 결과만 적음 끝이네

//		CalcQuiz q = new CalcQuiz();
//		
//		System.out.println(q.question);
//		System.out.println(q.answer);

		

		int quizNum = 5;
		CalcQuiz[] quiz = new CalcQuiz[quizNum];

		for (int i = 0; i < quizNum; i++) {
			quiz[i] = new CalcQuiz();
			System.out.println("문제" + i + ": " + quiz[i].getQuestion());

		}
		System.out.println("---------------------------");
		for (int i = 0; i < quizNum; i++) {
			System.out.println("답" + i + ": " + quiz[i].getAnswer());
		}

	}

}
