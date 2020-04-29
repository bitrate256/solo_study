#include <stdio.h>
/*
 출력 결과 확인.
 */
main()
{
	printf("%d", factorial(5));
}
factorial(int n) {
	if (n <= 1)
		return 1;
	else
		return n * factorial(n - 1);
}