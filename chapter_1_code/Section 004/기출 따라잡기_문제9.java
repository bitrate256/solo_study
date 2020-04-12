public class Test {
/*
실행결과 작성
답안 : 
*/
	public static void main(String args[]) {
		int a = 5, b = 9, c;
		c = b % 5 < 5 ? 1 : 0;
		c = c | c << 3;
		c = a < 5 || c >= 10 ? c - a : c + a;
		System.out.printf("%d", c);
	}
}