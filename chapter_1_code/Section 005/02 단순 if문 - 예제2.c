#include <stdio.h>
main()
{
	int a = 10, b = 20, cha;
	if (a > b)
		cha = a - b;
	else
		cha = b - a;
	printf("%d\n", cha);
}