#include <stdio.h>
int Fibonacci(int n) {
	if (n == 0)
		return 0;
	else if (n == 1)
		return 1;
	else
		return Fibonacci(n - 2) + Fibonacci(n - 1);
}
int main(void) {
	int i = 0;
	for (i = 0; i < 10; i++)
		printf("%d ", Fibonacci(i));
	return 0;
}