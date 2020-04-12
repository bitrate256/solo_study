#include <stdio.h>
int isprime(int number)
{
	int i;
	for (i = 2; i < number; i++)
		if (number % i == 0)
			return 0;
	return 1;
}
int main()
{
	int number = 99, cnt = 0, i;
	for (i = 2; i <= number; i++)
		cnt = cnt + isprime(i);
	printf("%d를 넘지 않는 소수는 %d개입니다.\n", number, cnt);
	return 0;
}