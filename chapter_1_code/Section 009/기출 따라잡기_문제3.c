#include <stdio.h>
/*
 피보나치 수를 구하는 알고리즘을 C로 구현.
 <피보나치 수>의 정의를 참고해 <코드>의 미완성 로직을 분석하고 괄호1,2 에 들어갈 적합한 코드 작성.

 <피보나치 수>의 정의
 Fibonacci(n)
  -if n=0, 0
  -if n=1, 1
  -others, Fibonacci(n-2) + Fibonacci(n-1)
  <코드>
int Fibonacci(int n) {
	if (n == 0)
		return 0;
	else if (n == 1)
		return (1번);
	else
		return Fibonacci(2번) + Fibonacci(n - 1);
}
int main(void) {
	int i = 0;
	for (i = 0; i < 10; i++)
		printf("%d ", Fibonacci(i));
	return 0;
}
 */
int Fibonacci(int n) {
	if (n == 0)
		return 0;
	else if (n == 1)
		return 1;
	else
		return Fibonacci(n - 2) + Fibonacci(n - 1);
}
int main(void) {
	int i = 0;
	for (i = 0; i < 10; i++)
		printf("%d ", Fibonacci(i));
	return 0;
}