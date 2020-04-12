#include <stdio.h>
main()
{
	int i = 10, hap = 0;
	while (i > 1)
	{
		i--;
		if (i % 3 == 1)
			hap += i;
	}
	printf("%d\n", hap);
}