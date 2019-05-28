package chapter_01;

public class C_returnType_02 {
	int hap(int x1, int x2, int x3, int x4, int x5) {
		return x1 + x2 + x3 + x4 + x5;
	}

	/*
	 * jvm 실행 순서를 적어보면 다음과 같음 11-12-13-4-5-6-14 순서로 처리됨
	 */
	public static void main(String[] args) {
		C_returnType_02 RT2 = new C_returnType_02();
		int a = RT2.hap(1, 2, 3, 4, 5);
		System.out.println("1부터 5까지의 합은 " + a + "입니다.");
	}
// 5개 숫자의 평균을 구하는 메소드를 선언해보세요
// 메소드의 이름은 avg 입니다.
}