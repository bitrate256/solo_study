/*
 이전 C 파일을 자바로 구현. 결과 확인.
 */
public class Example {
	public static void main(String[] args) {
		int a[] = new int[5];
		int i;
		for (i = 0; i < 5; i++)
			a[i] = i + 10;
		for (i = 0; i < 5; i++)
			System.out.printf("%d ", a[i]);
	}
}