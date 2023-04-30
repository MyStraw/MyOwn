package 자바1학년;

import java.util.Random;

public class 자바1학년_7구구단 {
	public static void main(String[] args) {

		Random rand = new Random();

		int total = 0;
		
		for (int i =2; i <= 9; i++) {
			for (int k = 1; k <= 9; k++) {
				System.out.println(i + "X" + k +"= " + i * k);
				
			}System.out.println();

		}
		
		
		for (int i = 0; i <=10 ; i++) {
			if(i==2) {
				continue;  //2가 되면 일단 중단하고 다음걸로 넘어간단 얘기다. 2는 작업을 안한단 얘기! continue는 다음부터 진행한단거다. 헷갈리지마
				
			}else if(i==4){
				break;
			}
			
			
			System.out.println(i);
		}
	}

}
