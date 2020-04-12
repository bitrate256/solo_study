import java.util.Scanner;
public class Test {
	public static void main(String[] args){
		int inNum;
		Scanner scan01 = new Scanner(System.in);
		inNum = scan01.nextInt();
		if(inNum % 2 == 0)
			System.out.printf("%d= 짝수입니다.\n", inNum);
		else
			System.out.printf("%d= 홀수입니다.\n", inNum);
		scan01.close();
	}
}