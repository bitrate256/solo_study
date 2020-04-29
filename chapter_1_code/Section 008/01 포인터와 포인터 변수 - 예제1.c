#include <stdio.h>
/*
 출력 결과 확인.
 */
main()
{
	int a = 50;
	int* b;
	b = &a;
	*b = *b + 20;
	printf("%d, %d", a, *b);
}