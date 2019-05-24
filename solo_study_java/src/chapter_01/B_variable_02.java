package chapter_01;

/*
변수에는 종류가 있다.
(변수[원시형변수], 인스턴스변수[참조형변수])

원시형 변수는 호출하면 값이 나옴
참조형 변수는 호출하면 주소번지가 출력됨.(예 : @15유1236)

주소번지로 무엇을 할 수 있는가?
그 주소번지가 가리키는 클래스 안에 변수를 부를 수 있다.

변수와 메소드를 구분하여라.
변수뒤에는 괄호가 없고 메소드 뒤에는 괄호가 있다.

변수의 선언 위치에 따라 전역변수인지 지역변수인지 구분할 수 있다.

디폴트값이란?
초기화를 통하여 변수의 적절한 값을 지정해 주는 것.
*/

public class B_variable_02 {
	/* 메인 메소드는 생략될 수 있다.
	 * 생략하면 단독으로 실행할 수 없다.
	 * 실행할 수 없으면 단위테스트 할 수 없다.
	 * int, double, boolean, String
	 */
	public class Pride {
	       boolean isPower = false;// 전원꺼짐, true:전원켬, 참 혹은 거짓.
	       int volume=0;
	}

	public class PrideDimulation {
		
		public void main(String[] args) {
	              Pride myCar = new Pride();
	              System.out.println("현재 볼륨의 크기는 얼마인가?:"+myCar.volume);
	       }
	}
	// 실행결과 => 현재 볼륨의 크기는 얼마인가?:0

}
