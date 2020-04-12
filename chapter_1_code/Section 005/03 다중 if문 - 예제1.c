#include <stdio.h>
main()
{
	int jum = 85;
	if (jum >= 90)
		printf("학점은 A입니다.\n");
	else if (jum >= 80)
		printf("학점은 B입니다.\n");
	else if (jum >= 70)
		printf("학점은 C입니다.\n");
	else
		printf("학점은 F입니다.\n");
}