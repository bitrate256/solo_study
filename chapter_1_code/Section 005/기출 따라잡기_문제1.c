#include <stdio.h>
main() {
	int a = 3, b = 10;
	if (b > 5)
		printf("%x\n", a + b);
	else
		printf("%x\n", b - a);
}