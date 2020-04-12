public class Test {
	public static void main(String[] args){
		int a = 10, b = 10, c = 30;
		a -= b -= c;
		a += b;
		String str01 = a <= b ? String.format("%d", a) : String.format("%d", b);
		System.out.printf(str01);
	}
}