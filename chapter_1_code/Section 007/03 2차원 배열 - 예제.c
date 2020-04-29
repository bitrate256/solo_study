#include <stdio.h>
/*
 3행 4열 배열에 다음과 같이 숫자 저장하기.
 1 /  2 /  3 /  4
 5 /  6 /  7 /  8
 9 / 10 / 11 / 12
 */
main()
{
	int a[3][4];
	int i, j, k = 0;
	for (i = 0; i < 3; i++)
	{
		for (j = 0; j < 4; j++)
		{
			k++;
			a[i][j] = k;
		}
	}
}