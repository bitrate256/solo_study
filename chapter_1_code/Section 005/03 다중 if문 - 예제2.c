#include <stdio.h>
// 홀/짝 판별하기.
main()
{
	int a = 21, b = 10;
	if (a % 2 == 0)
		if (b % 2 == 0)
			printf("모두 짝수.\n");
		else
			printf("a : 짝수, b : 홀수\n");
	else
		if (b % 2 == 0)
			printf("a : 홀수, b : 짝수\n");
		else
			printf("모두 홀수\n");
}