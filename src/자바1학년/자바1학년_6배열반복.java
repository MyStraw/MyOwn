package 자바1학년;

public class 자바1학년_6배열반복 {
	public static void main(String[] args) {
		
		int[] scorelist = {64,100,78,80,72};
		
		System.out.println(scorelist[0]);
		
		//이렇게 배열에 대해 일일이 표현할수도 있겠지만, 공통이 보이네? 인덱스가 공통이잖아
		
		//그럼 반복을 써야지
		
		System.out.println("------------------------");
		
		for(int i = 0; i <scorelist.length ;i++) { //배열이 몇개인지 알수 없으니 length로 개수를 해준다.
			System.out.println(scorelist[i]);
		}
		
		System.out.println("-------------------------");
		
		for(int score : scorelist) {
			System.out.println(score);
		}
		
		System.out.println("-------합할땐 토탈=0 만들고 하자------------------");
		
		int total = 0;
		for(int score : scorelist) {
			total += score;
			
		}
		System.out.println(total);
		
	}

}
