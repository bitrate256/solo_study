import java.util.Scanner;
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