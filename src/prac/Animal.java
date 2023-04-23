package prac;

//Animal 클래스: 동물을 추상화한 클래스

abstract class Animal {
	 protected String name; // 동물의 이름
	 protected int age; // 동물의 나이

	 // 생성자: 이름과 나이를 매개변수로 받아 초기화
	 public Animal(String name, int age) {
	     this.name = name;
	     this.age = age;
	 }

	 // 이름을 설정하는 메소드
	 public void setName(String name) {
	     this.name = name;
	 }

	 // 나이를 설정하는 메소드
	 public void setAge(int age) {
	     this.age = age;
	 }

	 // 이름을 반환하는 메소드
	 public String getName() {
	     return this.name;
	 }

	 // 나이를 반환하는 메소드
	 public int getAge() {
	     return this.age;
	 }

	 // 동물이 먹는 기능을 구현한 메소드
	 public void eat() {
	     System.out.println(this.name + " is eating.");
	 }

	 // 동물이 소리를 내는 기능을 추상화한 메소드
	 public abstract void makeSound();
	}


