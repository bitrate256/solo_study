class IntClass{
	int a;
	int b;
	int c;
}
public class Test {
	public static void main(String[] args) {
		IntClass myVar = new IntClass();
		myVar.a = 10;
		myVar.b = 20;
		prnt(myVar);
		System.out.printf("a=%d, b=%d, c=%d\n", myVar.a, myVar.b, myVar.c);
	}
	static void prnt(IntClass myVar)
	{
		myVar.a += 30;
		myVar.b -= 30;
		if (myVar.a <= myVar.b)
			myVar.c = myVar.a + myVar.b;
		else
	 		myVar.c = myVar.a - myVar.b;
	}
}