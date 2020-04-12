public class Test {
	public static void main(String[] args){
		int i = 0, hap = 0;
		for(i = 1; i <= 5; ++i, hap += i)
			System.out.printf("합은%d %4d입니다.\n", i, hap);
	}
}