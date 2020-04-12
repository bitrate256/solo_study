#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
/*
실행결과 작성
답안 : 
*/
main()
{
	int i = 5, j = 4, k = 1, L, m;
	L = i > 5 || j != 0;
	m = j <= 4 && k < 1;
	printf("%d, %d\n", L, m);
}