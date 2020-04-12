public class Test {
	static int Stack[] = new int[5];
	static int Top = -1;
	public static void main(String[] args) {
		push(100);
		push(110);
		push(120);
		pop();
		push(130);
		push(140);
		pop();
	}
	static void push(int i) {
		Top++;
		if (Top >= 5)
			System.out.printf("overflow");
		else
			Stack[Top] = i;
	}
	static void pop() {
		if (Top < 0)
			System.out.printf("underflow");
		else
			System.out.printf("%dÁ¦°Å\n", Stack[Top--]);
	}
}