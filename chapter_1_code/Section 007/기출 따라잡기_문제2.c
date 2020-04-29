#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
/*
 괄호에 들어간 적합한 코드 기입.
main() {
	int i, a[5], cnt = 0;
	for (i = 0; i < 5; i++)
		scanf("%d", &a[i]);
	for (i = 0; i < 5; i++) {
		if (a[i] % 2 (?) 0)
			cnt = cnt + 1;
	}
	printf("홀수의 개수 : %d개", cnt);
}
 */
main() {
	int i, a[5], cnt = 0;
	for (i = 0; i < 5; i++)
		scanf("%d", &a[i]);
	for (i = 0; i < 5; i++) {
		if (a[i] % 2 != 0)
			cnt = cnt + 1;
	}
	printf("홀수의 개수 : %d개", cnt);
}