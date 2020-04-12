#include <stdio.h>
/*
실행결과 작성
답안 : 
*/
main()
{
	int a = 5, b = 10, c = 15, d = 30, result;
	result = a * 3 + b > d || c - b / a <= d && 1;
	printf("%d\n", result);
}