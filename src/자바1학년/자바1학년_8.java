package 자바1학년;

import java.util.Random;

public class 자바1학년_8 {
	// 메소드 한가지 일은 한곳에 모은다 (어떤일을 하는 명령 집합)

	public static void main(String[] args) {

		sayHello(); // 이미 기록되어 있는걸 그냥 불러오는거. 단순.
		sayHello();
		sayHello();
		
		System.out.println("--------------------------------");

		sayHello2("이로하");
		sayHello2("늑대선생");// 늑대선생이 인수(아규먼트). 인수는 호출때 사용되는 실제값.
		//단순 작업에 + 약간의 수정을 가하고 싶을때.
		System.out.println("--------------------------------");

		int d = dice(); // 뭔가 동작을 한 뒤 나온 결과값을 받아야 할때. 대신 내가 넣을값은 없어.
		System.out.println("주사위는 " + d);
		System.out.println("--------------------------------");
		double anss= postTaxPrice(980); //980원을 입력한다. 이 타입은 메소드의 파라미터 타입과 일치해야해.
		// 980 입력을 했고 받아온 return값을 또 여기에 변수로 지정해줌.
		System.out.println(anss +"원");

	}

	/// 1. 인수(파라메터)와 반환값이 모두 없는 메소드 - 정해진일(변화없는작업) 시킬때.(단순 안녕하세요)
	static void sayHello() {
		System.out.println("안녕하세용");
	}

	// 2. 인수만 있는 메소드 - 다른 데이터를 넘겨주고 처리를 조정하고 싶을때.(사용자 이름을 붙여서 안녕하세요)
	static void sayHello2(String name) { // name이 파라미터. 입력값. 계속 여러개 쓸수있다. 컴마 컴마.
		// 파라미터는 메소드 선언시 사용
		System.out.println("안녕하세요" + name + "님");
	}

	// 3. 반환값만 있는 메소드 - 처리에 변화가 있으므로 알고싶을때. 실행해야 결과를 알수있는것(매번 결과바뀌는 주사위)
	static int dice() { // 주사위 눈을 반환해야해. 반환값에 따라 타입.
		Random rand = new Random();
		int ans = rand.nextInt(6);
		return ans;
	}
	// 4. 인수와 반환값이 모두 있는 메소드 - 데이터를 넘겨주고 계산하거나 실행 결과를 알고싶을때. (이게 진짜 함수지)
	// 상품 본체의 가격에 따라 소비세 금액이 변하지. 내가 입력해준 값이 있고, 받아내야 할 값이 있을때.
	
	static double postTaxPrice(int price) { //호출한 인수값이 여기로 넘어온다. 인수값이 price로 들어온다. 타입일치.
		// 그리고 postTaxPrice가 내보낼 값이 double 인 것이다. 제어문, 반환타입, 메소드.
		double anse = price * 1.08; //받아온 인수값(매개변수로 이름만)을 이용. 이 결과를 변수에 대입.
		return anse; // 이 결과(price * 1.08한 결과)를 다시 호출한 쪽으로 돌려보내.
	}

}
