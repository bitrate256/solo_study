#include <stdio.h>
main() {
	int a, b, c, result;
	a = 1;
	b = 2;
	c = 3;
	result = ++a + b++ + ++c;
	printf("%d %d %d %d\n", result, a, b, c);
}