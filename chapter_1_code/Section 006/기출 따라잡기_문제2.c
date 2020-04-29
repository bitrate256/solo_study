#include <stdio.h>
/*
 코드와 출력을 보고 빈칸에 들어갈 코드 쓰시오.
 int main(void) {
	int i, j, n;
	n = (?);
	for (i = 1; i <= (?); i++) {
		for (j = 1; j <= i; j++)
			printf("%3d", j);
		printf("\n");
	}
}
 */
int main(void) {
	int i, j, n;
	n = 7;
	for (i = 1; i <= n; i++) {
		for (j = 1; j <= i; j++)
			printf("%3d", j);
		printf("\n");
	}
}