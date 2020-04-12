public class Test {
	public static void main(String[] args) {
		int[][] a = new int[3][5];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				a[i][j] = i + j;
				System.out.printf("%d ", a[i][j]);
			}
			System.out.println();
		}
	}
}