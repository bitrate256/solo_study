#include <stdio.h>
main() {
	int a, hap = 0;
	for (a = 0; a < 10; ++a, hap += a);
	printf("%d, %d\n", a, hap);
}