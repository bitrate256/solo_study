#include <stdio.h>
/*
 출력 결과 확인.
 */
main()
{
	int a[5];
	int i;
	int* p;
	for (i = 0; i < 5; i++)
		a[i] = i + 10;
	p = a;
	for (i = 0; i < 5; i++)
		printf("%d ", *(p + i));
}