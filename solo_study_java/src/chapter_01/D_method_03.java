package chapter_01;

/*
글자 하나로 돼있는건 작은 따옴표, CHAR 타입
문자 여러개는 큰 따옴표, STRING 타입

기본형 - 값이 출력됨 (계산을 위한 실제 값을 저장함) => 논리형(boolean), 문자형(char), 정수형(byte, short, int, long), 실수형 (float, double)
참조형 - 주소번지(객체의 주소를 저장하는 개념) (이것으로 변수나 상수 호출 / 메소드 호출)

alt 누른 상태에서 방향키 위아래로 하면 줄바꿈 가능

       byte      <      short      <      int      <      long      <      float      <      double
자동형변환           char            4byte            8byte                                   실수형

정확도는 double이 더 높음

long = 5L
float f = 5f
*/

import java.util.Scanner;

public class D_method_03 {
	boolean isPower = false; // 전역변수, 초기값은 TV가 꺼져있으므로 false임.
	int channel = 0;
	int menu = 0;

	public void channelUp() {
		// 메소드를 호출했을 때 실행문 +1증가함
		channel = channel + 1;
	}

	public void channelDoun() {
		channel = channel - 1;
	}

	public void volumnUp() {
		// 메소드를 호출했을 때
	}

	public void volumnDown() {
	}

	public boolean powerOn() {
		return isPower = true;
	}

	public boolean powerOff() {
		return isPower = false;
	}

	public static void main(String[] args) {

	}
}