package 자바1학년;

public class 자바1학년_2 {
	public static void main(String[] args) {
		
	
	
	double doubleA = 1234.5678;
	int intA = 12345;

	intA = (int)doubleA;
	System.out.println(intA);
	
	System.out.println("------------------------------");
	System.out.println("숫자를 문자열로 변환");
	String stringA = Integer.toString(intA); // 인트를 문자열로 바꾸기
	String stringB = Double.toString(doubleA); // 더블을 문자열로 바꾸기
	
	System.out.println(stringA);
	System.out.println(stringB);
	System.out.println();
	System.out.println(doubleA + intA + " 변환전에는 더하면 숫자로 인식");
	System.out.println(stringA + stringB + " 변환후에는 문자열로 인식해 그냥 뒤에 이어붙이기");
		
	System.out.println("------------------------------");
	System.out.println("문자열 숫자로 변환");
	String stringC = "12345";
	String stringD = "1234.5678";		
	int intC = Integer.parseInt(stringC);
	double doubleC = Double.parseDouble(stringD);
	
	System.out.println(intC);
	System.out.println(doubleC);
	
	System.out.println(intC + doubleC + " 변환후에 숫자로 인식해서 계산이 된다");
	
	//꼭 앞에서부터 글자를 일일이 다 써가면서 할필요가 없다.
	// 이런식으로 이해를 하자. 인트를 문자열로 바꾸려면?
	// Integer.toString(intC) 이런식으로 먼저 적고. 인트를 to 스트링으로 바꿀래. 어떤인트? (intC)값을!
	// 이걸 어디다 대입해? 스트링으로 바꿀거니 stringC에다 대입해야지! stringC는 타입이 모다? String이다!
	// 이런식으로 뒤에서부터 생각해
	// String stringC = Integer.toString(intC); 그럼 이렇게 자연스레 적을수 있게 된다. 무조건 순서대로 적지 마라
	// 문자열을 숫자로 바꾸는것 또 한 그래
	
	// 문자열을 int로 바꿀래!
	// Integer.parseInt(stringC)
	
	

	
	
	
	
	}

}
