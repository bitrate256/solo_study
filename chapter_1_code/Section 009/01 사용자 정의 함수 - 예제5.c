#include <stdio.h>
/*
 출력 결과 확인.
 */
int add(int i, int j) {
	return i + j;
}
main() {
	int i = 10, j = 5, result;
	int (*pf)(int, int);
	pf = add;
	result = pf(i, j);
	printf("%d", result);
}