#include <stdio.h>
/*
 1~10 까지 홀수의 합을 더하되 2의 배수는 배제함. 결과 확인하시오.
 */
main()
{
	int a = 0, hap = 0;
	while (1)
	{
		a++;
		if (a > 5)
			break;
		if (a % 2 == 0)
			continue;
		hap += a;
	}
	printf("%d, %d\n", a, hap);
}