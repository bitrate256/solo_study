package chapter_01;

/*
	i<5 -> Yes (true) + 실행문
	   ㄴ-> No (false) + 실행문
 */
public class D_method_05 {
	public static void main(String[] args) {
		// 남자니? 여자니? 홀수니? 짝수니? 불좀 켜줄래? 전원 켜져있니? 집에 왔니?
		// 동생이 있니? 수능을 보는 동생이 있니?....
		if (1 != 1) { // 참인지 거짓인지를 판별할 수 있는 코드
			System.out.println("조건을 만족했을 때");
		} else {
			System.out.println("조건을 만족하지 못했을 때");
		}

		// 1) 변수 선언 및 초기화 2) 조건식 3)증감연산자
		for (int i = 0; i < 5; i = i + 1) {
			System.out.println("i:" + i);
		}
		// 문제 43210이 출력되도록 아래 코드를 수정해보세요.
		for (int i = 0; i < 5; i = i + 1) {
			System.out.println("i:" + i);
		}
		// 조건절 추가
		for (int i = 0; i < 5; i = i + 1) {
			if (i % 2 == 0) {
				System.out.println("짝수:" + i);
			} else {
				System.out.println("홀수:" + i);
			}
		}
		// -1부터 10까지 세면서 짝수의 합을 구하는 프로그램을 작성해보시오.
		/*
		 * 변수는 몇개 필요함? 변수의 초기화는 어떤 값으로 해야 하는가? 반복문인가? 조건문인가? 둘 다 필요한가?
		 */
		int even = 0;
		for (int i = -1; i <= 10; i++) {
			if (i % 2 == 0) {
				even += i;
				System.out.println("-1부터 10까지 짝수의 합:" + even);
			}
		}
	}
}
