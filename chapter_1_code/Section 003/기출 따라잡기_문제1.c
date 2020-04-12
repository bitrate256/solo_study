#define _CRT_SECURE_NO_WARNINGS

// 코드 및 주석을 보고 실행결과를 작성
// 입력 : Welcome, C World!

#include <stdio.h>
main() {
	char input_Value[50];
	scanf("%s", input_Value);
	printf("%.4s", input_Value);
	printf("%3.2s", input_Value);
}

// 