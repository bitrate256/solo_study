#include <stdio.h>
/*
 출력 결과 확인.
 */
main() {
	int a[5], b = 1, sum = 0;
	for (int i = 0; i < 5; i++) {
		a[i] = b;
		b *= 2;
	}
	for (int i = 0; i < 5; i += 2)
		sum += *(a + i);
	printf("%d", sum);
}