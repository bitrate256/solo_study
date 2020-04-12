#include <stdio.h>
main()
{
	int a = 0, hap = 0;
	while (1)
	{
		a++;
		if (a > 5)
			break;
		if (a % 2 == 0)
			continue;
		hap += a;
	}
	printf("%d, %d\n", a, hap);
}