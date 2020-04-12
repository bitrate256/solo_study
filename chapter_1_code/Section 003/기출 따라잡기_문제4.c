#define _CRT_SECURE_NO_WARNINGS
/*
코드 및 입력을 보고 실행결과 작성
입력 : 15#22
*/
#include <stdio.h>
main() {
	int i, j;
	scanf("%o#%x", &i, &j);
	printf("%d %d", i, j);
}