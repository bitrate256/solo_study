#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
// 10 보다 큰 값을 입력할 때 까지 입력하기.
main()
{
	int a;
again:
	scanf("%d", &a);
	if (a <= 10)
		goto again;
	else
		printf("%d는 10보다 큽니다.", a);
}