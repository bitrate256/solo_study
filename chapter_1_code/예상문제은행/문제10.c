#include <stdio.h>
main() {
	int a = 12, b = 8, c = 2, d = 3;
	a /= b++ - c * d;
	printf("%d", a);
}