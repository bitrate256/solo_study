package chapter_01;

/*
메소드 안에서 지역변수인 age와 name 값을 재사용 하기 위해서 어떻게 해야 하는가?

연습문제
1부터 5까지의 합을 구하는 클래스를 작성하시오
변수는 몇개 필요하지?
변수는 지역? 전역?
초기화는?

출력결과 -> 1부터 5까지의 합은 15입니다.
*/
public class B_variable_05 {
	public static void ex() {
		int i = 1;
		int Hap = 0;
		Hap = i + (i * 2) + (i * 3) + (i * 4) + (i * 5);
		System.out.println(i + "부터" + (i * 5) + "까지의 합은" + Hap + "입니다.");
	}

	public static void main(String[] args) {
		ex();
	}
}