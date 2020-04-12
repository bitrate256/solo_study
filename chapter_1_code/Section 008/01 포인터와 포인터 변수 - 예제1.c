#include <stdio.h>
main()
{
	int a = 50;
	int* b;
	b = &a;
	*b = *b + 20;
	printf("%d, %d", a, *b);
}