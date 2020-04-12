public class Test {
	public static void main(String[] args) {
		int j, k, L, result;
		j = 10;
		k = 20;
		L = 30;
		result = j < k ? k++ : --L;
		System.out.printf("%d %d %d\n", result, k, L);
	}
}