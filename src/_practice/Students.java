package _practice;

//하나의 java file에 Student 객체를 정의하고 구현하는 실습
/*
 * 생성자 함수 구현 - this(); 호출 사용
 * static 데이터 멤버 사용
 * static 멤버 함수 구현
 * toString() 함수 구현과 사용
 * 객체 배열 사용
 */
//이건 한화면
public class Students {
	static int countStudents;
	int sid;
	String sname;
	String city;

	public String toString() {
		return "sid = " + sid + " sname = " + sname + " city = " + city;
	}

	void showStudent() {
		System.out.println(this.toString()); 
	}

	public Students() {
		this(0, null, null);
	}

	public Students(int sid) {
		this(sid, null, null);
		
	}

	public Students(int sid, String sname) {
		this(sid, sname, null);
	}

	public Students(int sid, String sname, String city) {
		this.sid = sid;
		this.sname = sname;
		this.city = city;
		countStudents++;
	}

	static void showNumberObjects() {
		System.out.println("객체 수: " + countStudents);
	}

	public static void main(String[] args) {
//		int [] a = new int [5]; // 정수 배열
		Students[] array = new Students[5];
		array[0] = new Students();
		array[1] = new Students(202301);
		array[2] = new Students(202302, "Hong");
		array[3] = new Students(202303, "Lee", "Busan");
		array[4] = new Students(202304, "Na", "jeju");
		Students.showNumberObjects();

		for (int i = 0; i < 5; i++) {
			array[i].showStudent();
		}
	}
}
