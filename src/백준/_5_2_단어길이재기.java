package 백준;

import java.util.Scanner;

public class _5_2_단어길이재기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		int n = str.length();
		System.out.println(n);
//
//		char[] a = new char[100];
//		int count = 0;
//
//		for (int i = 0; i < 100; i++) {
//			char s = str.charAt(i);
//			a[i] = s;
//
//			if (a[i] != '0') {
//				count++;
//
//			} 
//
//		}
//		System.out.println(count); //내가 처음에 푼 해결방식은, length를 몰라서, 각 글자를 배열에 넣은뒤, 배열에 뭔가 들어있으면 카운트를 1 올리는 방식을 생각했었다.
								   // 배열에 아무것도 안들어 가있으면, 보통 0이 들어가거나 String 배열인 경우 null 값이 들어가므로 이를 이용한것.
								   // 하지만 입력받는 string의 길이가 훨씬 긴데 비해, 내가 만든 배열은 100개 였으므로, 100개보다 더 긴 단어를 입력할수 있으니
								   // 여기서 index out of 같은 에러가 난것같다. 계속 여기서 막혀서 진행이 안됐음.

	}
}

//-----------------------------------------내가 한 코드. 에러남.
// length 쓰면 한방에 끝.
// ---------------------------------------- 굳이 for 쓰려면
//import java.util.Scanner;
//
//public class _5_2_단어길이재기 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        sc.close();
//
//        char[] a = str.toCharArray();
//        int count = 0;
//
//        for (char c : a) {
//            if (c != 0) {
//                count++;
//            } else {
//                break;
//            }
//        }
//        System.out.println(count);
//    }
//}
//-------------------------------------------------------
//import java.util.Scanner;
//
//public class _5_2_단어길이재기 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        sc.close();
//
//        char[] a = new char[100];
//        int count = 0;
//
//        for (int i = 0; i < 100; i++) {
//            if (i < str.length()) {
//                a[i] = str.charAt(i);
//                count++;
//            } else {
//                break;
//            }
//        }
//        System.out.println(count);
//    }
//}
