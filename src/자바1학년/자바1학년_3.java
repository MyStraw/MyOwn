package 자바1학년;

public class 자바1학년_3 {
	public static void main(String[] args) {
		
		//배열 만들기
		
		
		String[] lunch = {"스페셜햄버거", "4종 치즈피자", "로스트 치킨 샌드위치", "햄 샌드위치"} ;
		System.out.println(lunch[2]);
				
		//혹은
		
		String[] lunch2 = new String[4];
		
		lunch2[0]= "스페셜햄버거";
		lunch2[1]= "4종 치즈피자";
		lunch2[2]= "로스트 치킨 샌드위치";
		lunch2[3]= "햄 샌드위치";
		
		System.out.println(lunch2[3]);
		
		
		// 아 배열 만들때 배열안에 어떤 타입이 들어갈지를 먼저 정해주고. 변수이름을 해주는군.
		
	}

}
