package 자바1학년;

import java.util.Random;

public class 자바1학년_10 {
	public static void main(String[] args) {
		luckytest(); //보기만 해도 메소드 호출인걸 알겄냐.

	}

	static void luckytest() { //반환값 없다. static 메모리에 바로 넣어서 쓸수있다.
		String[] jebi = { "행운", "좋음", "보통", "조심", "나쁨" }; // 배열
		
		// String [] jebi = new String[]; 이걸로 해도 되고. 저렇게 바로넣어도 되고.
		//jebi[1] => 1번 배열에 바로 값 넣기.
		Random rand = new Random();
		
		int id = rand.nextInt(5); // jebi 배열길이는 5개. 괄호안에 5를 넣어도 됨. 5개 = 0,1,2,3,4
		// int 니까 0,1,2,3,4 중에 하나가 들어가겠지.
		System.out.println(jebi[id]);
		

	}
}
