public class Test {
	/*
	 실행 결과 확인.
	 */
	static int res10() {
		return 4;
	}
	static int res30() {
		return 30 + res10();
	}
	static int res200() {
		return 200 + res30();
	}
	public static void main(String args[]) {
		int result;
		result = res200();
		System.out.print(result);
	}
}