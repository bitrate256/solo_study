public class Test {
	public static void main(String[] args){
		int a, b, c;
		a = 10;
		b = 20;
		c = prnt(a, b);
		System.out.printf("a=%d, b=%d, c=%d\n", a, b, c);
	}
	static int prnt(int x, int y)
	{
		int z;
		if (x == y) z = x + y;
		else z = x - y;
		return(z);
	}
}