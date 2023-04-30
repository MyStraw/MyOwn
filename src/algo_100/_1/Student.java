package algo_100._1;

public class Student {
	
	private String name; //멤버변수는 거의 99& private
	private String no; // 소스 제너레이터에서 다 만들기
	
	public Student(String name, String no) {
		super();
		this.name = name;
		this.no = no;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	

}
