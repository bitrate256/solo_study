public class Test {
/*
실행결과 작성
답안 : 
*/
	public static void main(String args[]) {
		int a = 12, b = 5, sum = 2;
		b *= a /= 4;
		sum += ++a * b-- / 4;
		System.out.printf("%d", sum);
	}
}