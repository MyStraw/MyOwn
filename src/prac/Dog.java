package prac;

//강아지 클래스: Animal 클래스를 상속받음

class Dog extends Animal implements Barkable, Scratchable {
	 // 생성자: 이름과 나이를 매개변수로 받아 초기화
	 public Dog(String name, int age) {
	     super(name, age); // 부모 클래스의 생성자 호출
	 }

	 // 추상화된 메소드를 구현함
	 @Override
	 public void makeSound() {
	     System.out.println(this.name + " is barking.");
	 }

	 // Barkable 인터페이스의 메소드를 구현함
	 @Override
	 public void bark() {
	     System.out.println(this.name + " is barking loudly.");
	 }

	 // Scratchable 인터페이스의 메소드를 구현함
	 @Override
	 public void scratch() {
	     System.out.println(this.name + " is scratching itself.");
	 }

	 // 강아지의 나이를 1살 증가시키는 메소드
	 public void grow() {
	     if (this.age < 20) { // 나이가 20살 미만일 때만 증가
	         this.age++;
	     }
	 }
	}
