package _text;

public class Student22 {
	static int countStudents;
	int sid;
	String sname;
	String city;

	public Student22() { //위에서 내부클래스 초기화를 다 해줬고, 그 아래 값들에 대한 생성자가 오는게 순서적으로 좋겠네
		this(0, null, null);
	}

	public Student22(int sid) {
		this(sid, null, null);
	}

	public Student22(int sid, String sname) {
		this(sid, sname, null);
	}

	public Student22(int sid, String sname, String city) {
		this.sid = sid;
		this.sname = sname;
		this.city = city;
		countStudents++;
	}

	static void showNumberObjects() {
		System.out.println("객체 수: " + countStudents);
	}

	void showStudent() {
		System.out.println(this.toString());
	}

	public String toString() {
		return "sid = " + sid + " sname = " + sname + " city = " + city;
	}

	public static void main(String[] args) {
		Student22[] array = new Student22[5];
		array[0] = new Student22();
		array[1] = new Student22(202301);
		array[2] = new Student22(202302, "Hong");
		array[3] = new Student22(202303, "Lee", "Busan");
		array[4] = new Student22(202304, "Na", "Jeju");
		Student22.showNumberObjects();

		for (int i = 0; i < 5; i++) {
			array[i].showStudent();
		}
	}
}
