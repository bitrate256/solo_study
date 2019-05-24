package chapter_01;

public class B_variable_06 {
	int age; // 전역변수
	String name; // 전역변수

	void methodB(int age, String name) {
		System.out.println("나이는 " + age + "살, 이름은 " + name);
		this.age = age;
		this.name = name;
	}

	void methodC() {
		methodB(27, "싱하");
		System.out.println(this.age + "," + this.name);
	}

	public static void main(String[] args) {
		B_variable_06 B = new B_variable_06();
		B.methodC();
	}
}
/*
 * 결과: 나이는 27살, 이름은 싱하
 *      27, 싱하
 */