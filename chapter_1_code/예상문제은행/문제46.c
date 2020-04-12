#include <stdio.h>
void prnt(int* a, int* b, int* c);
main() {
	int a = 0, b = 5, c = 0;
	prnt(&a, &b, &c);
	printf("a=%d, b=%d, c=%d\n", a, b, c);
}
void prnt(x, y, z)
int* x, * y, * z;
{
	while (*x < *y) {
		++* x;
		*z = *z + *x;
		prnt(x, y, z);
	}
}