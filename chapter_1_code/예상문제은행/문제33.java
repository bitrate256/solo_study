public class Test {
	public static void main(String[] args) {
		int i, hap = 0;
		for(i = 1; i <= 10; ++i, hap += i);
		System.out.printf("%d, %d\n", i, hap);
	}
}