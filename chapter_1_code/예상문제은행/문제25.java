public class Test {
	public static void main(String[] args){
		int a = 3, b = 4, c = 5, d = 5;
		a += 6 + --b;
		d *= 7 - c++;
		System.out.printf("%d, %d, %d, %d\n", a, b, c, d);
	}
}