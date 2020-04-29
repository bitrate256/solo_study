#include <stdio.h>
/*
 출력 결과 확인.
 */
main()
{
	int a = 3, * b;
	b = &a;
	printf("%d", ++*b);
}