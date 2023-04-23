package _ChatGPT;

//Animal 클래스 정의
abstract class Animal {
 private String name;

 // 생성자: 객체를 생성하고 초기화하는 역할을 수행합니다.
 public Animal(String name) {
     this.name = name;
 }

 // 게터: 객체의 속성을 가져오는 메소드입니다.
 public String getName() {
     return name;
 }

 // 세터: 객체의 속성을 변경하는 메소드입니다.
 public void setName(String name) {
     this.name = name;
 }

 // 추상 메소드: 하위 클래스에서 구현해야 하는 메소드입니다.
 public abstract void speak();

 // 메소드 오버라이딩: 상위 클래스의 메소드를 재정의하는 것입니다.
 @Override
 public String toString() {
     return "Animal [name=" + name + "]";
 }
}

//인터페이스: 구현해야 하는 메소드들의 목록을 정의합니다.
interface Swimmable {
 void swim();
}

//Dog 클래스는 Animal 클래스를 상속받습니다. 이를 통해 다형성을 구현할 수 있습니다.
class Dog extends Animal {
 public Dog(String name) {
     super(name);
 }

 // speak 메소드를 구현합니다.
 public void speak() {
     System.out.println(getName() + " says: Woof!");
 }
}

//Fish 클래스는 Animal 클래스를 상속받고, Swimmable 인터페이스를 구현합니다.
class Fish extends Animal implements Swimmable {
 public Fish(String name) {
     super(name);
 }

 // speak 메소드를 구현합니다.
 public void speak() {
     System.out.println(getName() + " says: Blub!");
 }

 // swim 메소드를 구현합니다.
 public void swim() {
     System.out.println(getName() + " is swimming!");
 }
}

public class Main {
 public static void main(String[] args) {
     // 인스턴스 생성: 클래스의 객체를 만들고 변수에 할당합니다.
     Animal dog = new Dog("Buddy");
     Animal fish = new Fish("Nemo");

     // if 문: 조건에 따라 다른 코드를 실행합니다.
     if (dog instanceof Swimmable) {
         ((Swimmable) dog).swim();
     } else {
         System.out.println(dog.getName() + " can't swim.");
     }

     if (fish instanceof Swimmable) {
         ((Swimmable) fish).swim();
     } else {
         System.out.println(fish.getName() + " can't swim.");
     }

     // for 문: 일정한 조건이 충족될 때까지 반복적으로 코드를 실행합니다.
     for (int i = 0; i < 3; i++) {
         dog.speak();
         fish.speak();
     }
 }
}







