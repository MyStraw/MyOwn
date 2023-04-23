package prac;

//고양이 클래스: Animal 클래스를 상속받음

class Cat extends Animal implements Scratchable {
	 // 생성자: 이름과 나이를 매개변수로 받아 초기화
	 public Cat(String name, int age) {
	     super(name, age); // 부모 클래스의 생성자 호출
	 }

	 // 추상화된 메소드를 구현함
	 @Override
	 public void makeSound() {
	     System.out.println(this.name + " is meowing.");
	 }

	 // Scratchable 인터페이스의 메소드를 구현함
	 @Override
	 public void scratch() {
	     System.out.println(this.name + " is scratching the furniture.");
	 }
	}

	//Barkable 인터페이스: 짖는 기능을 추상화한 인터페이스

	interface Barkable {
	    // 짖는 기능을 추상화한 메소드
	    void bark();
	}

	// Scratchable 인터페이스: 긁는 기능을 추상화한 인터페이스
	interface Scratchable {
	    // 긁는 기능을 추상화한 메소드
	    void scratch();
	}
