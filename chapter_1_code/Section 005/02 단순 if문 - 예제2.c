#include <stdio.h>
// a가 b보다 크면 'a-b', 아니면 'b-a'를 수행.
main()
{
	int a = 10, b = 20, cha;
	if (a > b)
		cha = a - b;
	else
		cha = b - a;
	printf("%d\n", cha);
}