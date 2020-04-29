#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
/*
 <출력>과 같은 결과를 나타내는 프로그램을 C언어로 구현한 것임.
 빈칸 1~4에 들어갈 적합한 코드는?

 <출력>
 18, 6
 <코드>
int sub(int i, int j) {
	return i - j;
}
int add(int i, int j) {
	return i + j;
}
main() {
	int i, j, result;
	int (*pf)(int, int);
	scanf("%d, %d", &i, &j);
	pf = (1번);
	(2번) = pf(i, j);
	printf("%d, ", result);
	(3번) = sub;
	result = (4번);
	printf("%d", result);
}
 */
int sub(int i, int j) {
	return i - j;
}
int add(int i, int j) {
	return i + j;
}
main() {
	int i, j, result;
	int (*pf)(int, int);
	scanf("%d, %d", &i, &j);
	pf = add;
	result = pf(i, j);
	printf("%d, ", result);
	pf = sub;
	result = pf(i, j);
	printf("%d", result);
}