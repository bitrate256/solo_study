import java.util.Scanner;
/*
 실행하여 키보드 5입력한 이후의 출력 결과는?
 */
public class Test {
	public static void main(String args[]) {
		int i;
		Scanner s = new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ�: ");
		i = s.nextInt();
		recursive(i);
		s.close();
	}
	static int recursive(int n) {
		int i;
		if (n < 1)
			return 2;
		else {
			i = (2 * recursive(n - 1)) + 1;
			System.out.println(i);
			return i;
		}
	}
}