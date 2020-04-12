#include <stdio.h>
main()
{
	int hap, j, k, L;
	j = k = L = 0;
	hap = ++j + k++ + ++L;
	printf("%d, %d, %d, %d\n", hap, j, k, L);
}