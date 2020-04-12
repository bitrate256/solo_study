#include <stdio.h>
int main(void) {
	int i, j, n;
	n = 7;
	for (i = 1; i <= n; i++) {
		for (j = 1; j <= i; j++)
			printf("%3d", j);
		printf("\n");
	}
}