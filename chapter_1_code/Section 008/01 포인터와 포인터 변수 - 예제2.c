#include <stdio.h>
main()
{
	int a = 3, * b;
	b = &a;
	printf("%d", ++*b);
}