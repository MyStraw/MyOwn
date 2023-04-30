package 자바1학년;

import java.util.Random;

public class 자바1학년_4 {
	//if 문
	public static void main(String[] args) {
		
		System.out.println("-------if, else 써보기");
		int score = 60;
		
		if (score >=80) {
			System.out.println("야호~! 다음에도 잘해야지");
		}
		else {
			System.out.println("분발하세요");
		}
		
		System.out.println("-------구구단-----------------");
		
			
		
		int sum = 0;
		
		for (int i = 2; i<10; i++) {
			for (int k = 1; k<10 ; k++) { // i=2인 상태로 시작. k가 1부터 9가 될대까지 이 루프안에 갇혀있다.
				sum = i*k; // 2*k인 상태로 루프를 돈다. 2*1 되면 바로 밑에꺼 출력하고, 그리고 k가 아직 10 미만이니 k++가 됨. 
				System.out.println(i + "*" + k + "=" +sum); //순서가 k값 조건을 먼저보고, k<10인가 보고 해당하면 아래 {}를 돌고, 그리고 다 돌고나서 k++하고 나온다. k++는 루프 끝내고 나오면서 하는거.			
			}System.out.println();			
			
		}	
		
		System.out.println("-------1부터 랜덤 C 까지 합-----------------");		
	
		Random randd = new Random();
		
		int C = randd.nextInt(14);
		System.out.println(C);
				
		
		int summ = 0;		
		for (int i = 1; i<=C; i++) {			
			summ = summ + i;		
		}System.out.println(summ);
		
		System.out.println("-------랜덤 if-----------------");
		
		Random rand = new Random();
		
		int A = rand.nextInt(100);
		
		System.out.println(A);
		
		if (A >= 90) {
		System.out.println("당첨");
		
		}
		else {
		System.out.println("낙첨!");
		}
		
		System.out.println("-------------랜덤 switch-------------------");
	
		
		Random rnd = new Random();
		
		int B = rnd.nextInt(10);
		
		System.out.println(B);
		switch(B){
		
		case 10:
			
		case 9:
			System.out.println("수");
			break;
		case 8:
			
			
		case 7:
			System.out.println("우");
			break;
			
		case 6:
			
		case 5:
			System.out.println("미");
			break;
		case 4:
			
		case 3:
			System.out.println("양");
			break;
		case 2:
			
		case 1:
			
		case 0:
			System.out.println("가");			
			
			break;
			
		}
	}

}
