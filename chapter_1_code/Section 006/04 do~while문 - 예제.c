#include <stdio.h>
/*
 1~10 까지 홀수의 합을 더함. 결과 확인하시오.
 */
main()
{
	int a = 1, hap = 0;
	do
	{
		hap += a;
		a += 2;
	} while (a < 10);
	printf("%d, %d\n", a, hap);
}