#include <stdio.h>
/*
실행결과 작성
답안 : 
*/
main()
{
	int hap, j, k, L;
	j = k = L = 0;
	hap = ++j + k++ + ++L;
	printf("%d, %d, %d, %d\n", hap, j, k, L);
}