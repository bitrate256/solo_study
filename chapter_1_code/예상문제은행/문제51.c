#include <stdio.h>
#define s 6
void bubble_sort(int list[]) {
	int j, k, p, tmp;
	for (j = 1; j < s; j++) {
		for (k = 0; k < s - j; k++) {
			if (list[k] > list[k + 1]) {
				tmp = list[k];
				list[k] = list[k + 1];
				list[k + 1] = tmp;
			}
			for (p = 0; p < s; p++)
				printf("%d", list[p]);
			printf("\n");
		}
	}
}
main()
{
	int list[s] = { 9, 4, 3, 6, 8, 1 };
	int i;
	for (i = 0; i < s; i++)
		printf("%d", list[i]);
	printf("\n");
	bubble_sort(list);
}