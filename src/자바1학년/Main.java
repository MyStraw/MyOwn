package 자바1학년;

public class Main {
	public static void main(String[] args) {

		자바1학년_12 myClass = new 자바1학년_12();
		자바1학년_12 iroha = new 자바1학년_12();
		자바1학년_12 teacher = new 자바1학년_12();
		

		iroha.myName = "이로하"; // 이 객체의 원래 클래스에 있는 myName 필드를 호출해서 값을 넣는다.
		teacher.myName = "선생님";
		
		
		myClass.hello();
		iroha.hello();
		teacher.hello();

	}

}
