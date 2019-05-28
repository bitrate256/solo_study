package chapter_01;

public class C_returnType_01 {
	/*
	 * 메소드의 리턴타입을 void로 했을 경우 반환값이 비어있다 의미이므로 값을 받을 수 없다. 아래처럼 void 자리에 int를 사용하면
	 * 반환값이 있는 경우이므로 대입연산자를 통해서 처리된 결과값을 받을 수 있다. int re = r.methodA(); 주의사항 리턴타입
	 * 자리에 void 대신 int를 사용한 경우 반드시 메소드가 끝나기 전에 return 예약어를 붙이고 값 혹은 변수 이름을 반드시 주어야
	 * 한다.
	 */
	int methodA() {
		int x = 10;
		// return 10;
		return x;
	}

	public static void main(String[] args) {
		C_returnType_01 rt = new C_returnType_01();
		int re = rt.methodA();
		System.out.println("리턴값 re는" + re);
	}
}