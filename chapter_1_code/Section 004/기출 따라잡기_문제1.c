#include <stdio.h>
main() {
	int result, a = 100, b = 200, c = 300;
	result = a < b ? b++ : --c;
	printf("%d, %d, %d\n", result, b, c);
}