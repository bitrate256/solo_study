#include <stdio.h>
main()
{
	char a[] = { 'A', 'B', 'C', 'D', 'E', 'F' };
	char* p;
	p = &a[2];
	printf("%c, %c\n", *p, *(p - 2));
}