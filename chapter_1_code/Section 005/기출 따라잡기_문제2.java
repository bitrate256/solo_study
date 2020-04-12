import java.util.Scanner;
/*
a,b 에 각각 8과 3을 입력했을 때 실행 결과는?
실행결과 작성
답안 : 
*/
public class Test {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		char c = 'G';
		if (a > 10 && b < 10) {
			if (a - b < 5 || a > 15)
				c = 'X';
		}
		else if (a > 5 && b < 5) {
			if (a - b < 3 || b > 0)
				c = 'Y';
		}
		else
			c = 'Z';
		System.out.printf("%c", c);
		scan.close();
	}
}