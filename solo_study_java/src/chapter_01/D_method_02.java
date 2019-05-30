package chapter_01;

import java.util.Scanner;

public class D_method_02 {
	double moonWeight = 0.0;

	Double account(double earthWeight) {
		moonWeight = (earthWeight * 17) / 100;
		return moonWeight;
	}
	/*
	 * 달의 몸무게를 계산하는 메소드를 선언하시오 리턴타입 메소드 이름(파라미터)
	 * 질문1: 리턴 타입을 무엇으로 하는가? double
	 * 질문2: 파라미터는 꼭 필요한가? 꼭 필요하다. 그 이유는 무엇인가? 코드를 필요한 요구사항에 맞춰 재사용 하기 위해서이다.
	 * 질문3: 파라미터는 무슨 타입으로 할까? double.
	 * 질문4: 이 메소드 좌중괄호와 우중괄호 안에는 어떤 코드가 나오는가? 직접적인 계산 기능이 구현된다.
	 * 파라미터로 지구의 몸무게를 받아서 달의 몸무게 게산하는 공식에 적용해야 하니까.
	 * 질문5: MoonWeight.java 에서 재사용할 수 있는 코드들을 작성하라.
	 * 1) 달의 몸무게를 계산하는 식
	 * 2)사용자가 입력한 지구 몸무게를 가져오는 코드(Scanner)
	 * 도전 - 사용자가 입력한 지구몸무게를 읽어오는 메소드를 구현하기 리턴타입
	 * (필요함. 타입은? - double)메소드 이름(키보드로 입력한 값을 읽는거니까 필요없다)
	 * -> 리턴타입이 필요한 이유는 이 값을 account 메소드 에서 사용해야 하니까...
	 */

	// 계산은 메소드에서 하고 출력은 main 메소드에서 해야 하니깐..전역변수
	// 달의 몸무게를 계산하는 메소드를 선언하자.
	// 리턴 타입 메소드 이름()
	double userInput() {
		Scanner scan = new Scanner(System.in);
		// 사용자가 키보드를 이용해 입력한 값을 스캔하기
		// String u_value = scan.nextLine(); // 리턴 타입이 문자열 입니다
		double u_value2 = scan.nextDouble(); // 리턴 타입이 실수형 입니다
		return u_value2;
	}

	public static void main(String[] args) {
		// insert here -
		D_method_02 mw2 = new D_method_02();
		double ew = mw2.userInput(); // 지구 몸무게 담기 (ew는 지구 무게를 짧게 쓴것임)
		double mw = mw2.account(ew); // 달의 몸무게 담기 - 대입연산자, 리턴타입
		System.out.println("당신의 몸무게는(지구); " + ew + " 이고, 달의 몸무게는 " + mw + " 입니다.");
	}
}