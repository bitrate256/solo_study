#include <stdio.h>
main()
{
	int a = 1, hap = 0;
	do
	{
		hap += a;
		a += 2;
	} while (a < 10);
	printf("%d, %d\n", a, hap);
}