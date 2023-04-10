package _text;

import java.util.Scanner;

public class Dog {
    // 멤버 변수 선언
    String name;
    int age;

    // 생성자 메소드
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 메소드
    public void bark() {
        System.out.println(name + "이(가) 멍멍 짖습니다!");
    }

    public static void main(String[] args) {
        // 개 객체 생성
        Dog myDog = new Dog("바둑이", 3);

        // 메소드 호출
        myDog.bark();

        // 사용자 입력을 받아 while문으로 처리
        Scanner sc = new Scanner(System.in);
        System.out.print("얼마나 더 짖을까요? : ");
        int repeat = sc.nextInt();
        int count = 0;
        while (count < repeat) {
            System.out.print("왈! ");
            count++;
        }
        System.out.println();

        // 배열을 이용한 개 객체 생성 및 출력
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog("흰둥이", 2);
        dogs[1] = new Dog("깜둥이", 5);
        dogs[2] = new Dog("개똥이", 1);

        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i].name + "이(가) " + dogs[i].age + "살 입니다.");
        }
    }
}