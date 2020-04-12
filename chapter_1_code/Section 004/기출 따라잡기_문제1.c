#include <stdio.h>
/*
실행결과 작성
답안 : 
*/
main() {
	int result, a = 100, b = 200, c = 300;
	result = a < b ? b++ : --c;
	printf("%d, %d, %d\n", result, b, c);
}