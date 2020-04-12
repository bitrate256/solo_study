public class Test {
	public static void main(String[] args){
		int a, b, c, hap;
		a = b = c = 2;
		hap = ++a | b-- & c--;
		System.out.printf("%d %d %d %d", hap, a, b, c);
	}
}