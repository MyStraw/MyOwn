package prac;

// Main 클래스: 프로그램 실행 진입점
public class dogcat {
    public static void main(String[] args) {
        // 강아지와 고양이 인스턴스 생성
        Dog myDog = new Dog("Buddy", 3);
        Cat myCat = new Cat("Luna", 2);

        // 각 인스턴스에서 이름과 나이를 출력
        System.out.println("My dog's name is " + myDog.getName() + " and it is " + myDog.getAge() + " years old.");
        System.out.println("My cat's name is " + myCat.getName() + " and it is " + myCat.getAge() + " years old.");

        // 강아지가 나이를 1살 증가시키는 기능을 실행
        myDog.grow();

        // 강아지와 고양이가 각자 소리를 내는 기능을 실행
        myDog.makeSound();
        myCat.makeSound();

        // 강아지가 짖는 기능을 실행
        myDog.bark();

        // 강아지와 고양이가 긁는 기능을 실행
        myDog.scratch();
        myCat.scratch();

        // 1부터 10까지의 수를 더하는 for문
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("The sum of 1 to 10 is " + sum);

        // 나이가 5살 이상인 동물의 이름을 출력하는 if문
        if (myDog.getAge() >= 5) {
            System.out.println("My dog's name is " + myDog.getName());
        }
        if (myCat.getAge() >= 5) {
            System.out.println("My cat's name is " + myCat.getName());
        }
    }
}




