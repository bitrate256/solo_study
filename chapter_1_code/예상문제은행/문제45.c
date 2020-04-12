#include <stdio.h>
main() {
	int numAry[] = { 0,0,0,0,3 };
	int i, j;
	for (j = 4; j >= 0; --j)
		for (i = 4; i > j; --i)
			numAry[j] += numAry[i];
	for (j = 0; j < 5; ++j)
		printf("%d ", numAry[j]);
}