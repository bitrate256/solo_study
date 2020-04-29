#include <stdio.h>
/*
 1차원 배열 a의 각 요소에 10,11,12,13,14 를 저장한 후 출력하기.
 */
main()
{
	int a[5];
	int i;
	for (i = 0; i < 5; i++)
		a[i] = i + 10;
	for (i = 0; i < 5; i++)
		printf("%d ", a[i]);
}