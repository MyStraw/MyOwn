package _text;

public class TestStudent {
    public static void main(String[] args) {
        // Student 클래스로부터 학생 객체를 생성합니다.
        // 학생 객체는 s1, s2, s3 변수에 저장됩니다.
        Student s1 = new Student("홍길동", 25, "서울");
        Student s2 = new Student("김철수", 30, "부산");
        Student s3 = new Student("이영희", 27, "대구");

        // 각 학생 객체의 정보를 출력합니다.
        s1.printInfo();
        s2.printInfo();
        s3.printInfo();
    }
}

// 학생 클래스를 정의합니다.
class Student {
    // 학생의 이름, 나이, 거주지를 나타내는 필드를 선언합니다.
    private String name;
    private int age;
    private String address;

    // 생성자를 정의합니다. 생성자는 객체를 생성할 때 호출됩니다.
    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // 학생의 정보를 출력하는 메서드를 정의합니다.
    public void printInfo() {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("거주지: " + address);
        System.out.println();
    }
}