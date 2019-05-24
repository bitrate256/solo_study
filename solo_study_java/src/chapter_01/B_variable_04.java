package chapter_01;
/*
변수 선언 위치에 따른 변수의 종류
전역변수
지역변수


인스턴스변수(참조형변수)

원시형변수
참조형변수

자바에서는 같은 이름의 메소드가 중복되어도 에러가 발생하지 않는다.
 */
import java.util.Scanner; // util 패키지에서 Scanner 클래스 불러옴
/*
연습문제
달의 중력은 지구 중력의 17%다.
지구에서 몸무게가 100kg인 사람은 달에 가면 17kg다.
당신의 몸무게는 달에서 얼마인가?
몸무게 n은 실수이고 키보드로부터 입력받는다.

여기서 지변으로 사용할 변수는 무엇인가?
전역변수로 사용하는 경우가 차이가 있을것인가?

너의 몸무게를 입력받고 싶어요 -> 변수가 필요하다 -> 전역 & 지역변수 선택
키보드로 몸무게를 어떻게 입력받지? -> 안배웠다
연산자가 필요함 -> 오라클 패스
(몸무게x17)/100
예) 100*17/100 -> 시뮬레이션 해보기 -> 테스트 -> 검증

클래스 이름을 뭘로 할것인가? com.ch2.Moonlight.java

코딩 시작
 */
public class B_variable_04 {
       public static void main(String[] args) {
              Scanner scan = new Scanner(System.in); // 메인 메소드 안에 new 명령 사용해 Scanner 객체 선언함
                                                     // 여기서는 scan 이라는 이름의 객체를 선언함.
        System.out.print("몸무게를 입력하세요.:");
              String input = scan.nextLine();
              int num = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환함
              scan.close(); // 스캔 입력받는 것을 멈춤
              
              double result; // 결과값
              result = (num * 17)/100;
              
              System.out.println("몸무게는" + result + "입니다.");
       }
}