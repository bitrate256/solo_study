#include <stdio.h>
/*
 출력 결과 확인.
 */
main()
{
	char a[] = { 'A', 'B', 'C', 'D', 'E', 'F' };
	char* p;
	p = &a[2];
	printf("%c, %c\n", *p, *(p - 2));
}