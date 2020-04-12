#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
main()
{
	int num[10];
	int min = 9999;
	int i;
	for (i = 0; i < 10; i++) {
		scanf("%d", &num[i]);
	}
	for (i = 0; i < 10; i++) {
		if (min > num[i]) {
			min = num[i];
		}
	}
	printf("가장 작은 값은 %d이다.", min);
}