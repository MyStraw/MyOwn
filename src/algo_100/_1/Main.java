package algo_100._1;

import java.util.ArrayList;

//문제
//
//학생정보들을 저장하고, 학생이름으로 검색했을때 학번을 출력하는 프로그램 작성
//
//Student 클래스 생성
//String name, no를 가짐(이름과 학번)
//
//학생들을 ArrayList에 저장한 이후
//계속 검색을 하겠느냐 y->반복
//종료하고 싶으면 n->프로그램 종료
//
//학생 이름이 있는 경우 그 학생의 학번을 출력
//학생 이름이 없으면, 없는 학생이름이라고 출력


public class Main {
	
	public static void main(String[] args) {
		
		Student st1 = new Student("손오공", "1682");
		Student st2 = new Student("저팔계", "1772");
		Student st3 = new Student("사오정", "1813");
		
		//어레이 리스트에 넣어라 제네릭으로
		
		ArrayList <Student>list = new ArrayList<Student>();
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
		for(Student stu : list) {  //어레이 list를 처음부터 계속 순회할텐데~ 이때 stu에 첫번재 참조변수, 두번재 참조변수....
			//Student가 참조변수.
			
			System.out.println(stu.getName());
			System.out.println(stu.getNo());
			
		}
		
	}

}
