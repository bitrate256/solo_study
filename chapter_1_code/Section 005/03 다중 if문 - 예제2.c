#include <stdio.h>
main()
{
	int a = 21, b = 10;
	if (a % 2 == 0)
		if (b % 2 == 0)
			printf("¸ðµÎ Â¦¼ö\n");
		else
			printf("a : Â¦¼ö, b : È¦¼ö\n");
	else
		if (b % 2 == 0)
			printf("a : È¦¼ö, b : Â¦¼ö\n");
		else
			printf("¸ðµÎ È¦¼ö\n");
}