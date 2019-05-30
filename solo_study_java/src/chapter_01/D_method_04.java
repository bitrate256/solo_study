package chapter_01;
/*
연습문제 - 원의 면적을 계산하는 메소드를 구현하여 사용자로부터 반지름을 입력받아 원의 면적을 출력하는 클래스 작성.

클래스명 : D_method_04.java
메소드 이름 : account()
출력담당 메소드 이름 : CircleAreaPrint()

반지름*반지름*3.14
*/
import java.util.Scanner;

public class D_method_04 {
	final double PI = 3.14;
	double CircleArea = 0.0;
	double R = 0.0;

	double account() { // 이 메소드를 호출해야 함, 굳이 파라미터값을 넘길 필요는 없음. 이 메소드 안에서 스캐너로 받았기 때문에 파라미터는 역할이 없다
		System.out.println("원의 면적을계산하는 프로그램 입니다. 반지름을 입력하십시오 : ");
		Scanner scan = new Scanner(System.in);
		R = scan.nextDouble(); // 처음에 R 앞에 double이 붙어 있어서 전역변수를 그대로 불러와서 10이 유지가 됐었음. 그래서
		scan.close();
		CircleArea = R * R * PI;
		return CircleArea;
	}

	void CircleAreaPrint() {
		// CircleArea CA = new CircleArea(); // 역할 없음. 인스턴스화 필요 없음.
		System.out.println("원의 반지름: " + R + " 이며");
		System.out.println("넓이는 " + CircleArea + " 입니다."); // 전역변수에 결과값이 저장됐기 때문에 CircleArea가 맞음
	}

	public static void main(String[] args) { // 이쪽에서 호출
		D_method_04 CA = new D_method_04();
		// double R = R.userInput(R); // 이건 없는 메소드를 호출한 것, 없어도 되므로 나가리
		double result = CA.account(); // 대입연산자, 리턴타입 CA는 써클주소번지고 가로에 파라미터로 더블을 넘겨야 함
		// ;은 호출임. 값이므로 타입 쓸 필요 없기 때문에 수치를 불러와야 함.
		// 리턴타입이 더블인데, 써클에어리어 전역변수에 저장해주는 것이 써클에어리어고 떠블이 반환되는데 변수 이름이 같은게 있어서 에러가 났음.
		// 그래서 변수를 임의로 result로 바꿈
		CA.CircleAreaPrint(); // 최종적으로 써클에어리어 프린트를 호출하면 결과가 호출이 되므로 종료.
	}
}