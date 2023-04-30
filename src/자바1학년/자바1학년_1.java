package 자바1학년;

import java.util.Random;

public class 자바1학년_1 {
	public static void main(String[] args) {
		System.out.println(10 + 5);
		System.out.println(10/4.0);
		
		String world1 = "안녕하세요.";
		String world2 = "나는 Java입니다.";
		String world3 = world1 + world2;
		System.out.println(world3.length());
		
		System.out.println(world3.substring(0, 10));
		System.out.println(world3.substring(11));
		
		System.out.println(world3.replace("Java", "이로하"));
		
		String word = "안녕하세요. 나는 Java입니다.";
		word = word.replace("Java", "이로하");
		System.out.println(word);
		
		Random rand = new Random();
		int c = rand.nextInt(10);
		
		System.out.println(rand.nextInt(10));
		System.out.println(c);
		
		
		int a = rand.nextInt(100);
		int b = rand.nextInt(100);
		
		System.out.println(a+b);
	}

}
