package chapter_01; // 패키지 이름 - 폴더 이름 쯤으로 기억하면 무방

/*
● nextLine() 위에 마우스 올리면 보이는 API 설명

Public : 접근제한자(누구나 사용 가능)
String : 리턴타입(원시형, 레퍼런스)
nextLine() : 메소드 (파라미터가 없기 때문에 자바가 제공하는 것을 가따 쓰는 것

메소드의 종류는 두가지
-> 제공하는 메소드
-> 사용자 정의 메소드
*/

import java.util.Scanner;

//java.lang. *아래 있는 클래스는 따로 import 할 필요가 없다
public class D_method_01 {
	/*
	 * 기능 구현이 main 메소드 안에 있을 때 문제점 - main 메소드를 호출할 수 없다. 그래서 재사용할 수 없다. 다른 클래스에서 이
	 * 메소드를 호출할 수 없다는 뜻임. 만일 다른 클래스에서 이 메소드를 사용하고 싶을 땐 반드시 메소드를 선언하고 구현해야 함. 그러면 다른
	 * 쿨래스에서 부를 수 있음. 이때 메소드의 파라미터에 값을 넘길 수 있는데 이 파라미터 선언은 지역변수가 됨. 메소드의 파라미터인 지역변수는
	 * 메소드를 호출할때 초기화가 일어남. 이번엔 달의 몸무게를 계산하는 메소드를 main 메소드 밖에서 선언하라. 그리고 그 메소드에 필요한
	 * 코드를 입양해보자.
	 */
	public static void main(String[] args) {
		System.out.println("당신의 몸무게를 입력하시오.");
		Scanner scan = new Scanner(System.in);
		// 사용자가 키보드를 이용해 입력한 값을 스캔하기
		// String u_value = scan.nextLine(); // 리턴 타입이 문자열 입니다
		double u_value2 = scan.nextDouble(); // 리턴 타입이 실수형 입니다
		// int u_value3 = scan.nextInt(); // 리턴 타입이 정수형 입니다.

		// u_value = "띠용";
		// u_value2 = 70.1;
		// u_value3 = 70;

		// 달의 몸무게를 담을 변수 선언하기
		double weight; // 지역변수 - 반드시 초기화를 해야 한다.
		weight = 0; // 영향을 주지 않는 값을 초깃값을 하기 위해서 0부터 시작해야 함.
		// 달의 몸무게를 계산하는 공식이 뭐지? 17% or (몸무게*17)/100 or 몸무게*0.17
		// 계산절차가 적은 것이 더 빠르다.
		// weight = u_value2*0.17;
		weight = u_value2 * 0.17;
		// weight = u_value2*0.17/100;
		// weight = (u_value2*0.17)/100.0;
		System.out.println("당신의 지구 몸무게는 " + u_value2 + "이며, 달에서의 몸무게는 " + weight + "입니다.");
	}
}
// 다시 머지