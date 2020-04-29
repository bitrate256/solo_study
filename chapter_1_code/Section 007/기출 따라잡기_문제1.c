#include <stdio.h>
/*
 결과 확인.
 */
main() {
	int exint[] = { 2,4,2,47,6,4,7,2,3,4,5 };
	int len = sizeof(exint) / sizeof(int);
	int value = 0;
	for (int i = 0; i < len; i++) {
		if (exint[i] == 2) {
			value++;
		}
	}
	printf("%d", value);
}