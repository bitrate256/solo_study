package chapter_01;

public class D_method_06 {
	public static void main(String[] args) {
		int even = 0;
		for (int i = -1; i <= 10; i++) {
			if (i % 2 == 0) {
				even += i;
				// System.out.println("-1부터 10까지 짝수의 합:"+even); - 이전에는 이 위치에 있었음. 그러나 if문 안에 있기
				// 때문에 if가 반복되면서 계속 답이 출력됐음.
			}
		}
		System.out.println("-1부터 10까지 짝수의 합:" + even); // for 문 바깥으로 아예 빼버려서 최종적으로 한번만 표기되도록 수정함.
	}
}