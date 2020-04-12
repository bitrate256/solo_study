#include <stdio.h>
main()
{
	int jum = 95;
	char lev;
	switch (jum / 30)
	{
	case 3:
		lev = 'A'
			;
		break;
	case 2:
		lev = 'B'
			;
		break;
	case 1:
		lev = 'C'
			;
		break;
	default:
		lev = 'D'
			;
		break;
	}
	printf("%cµî±Þ\n", lev);
}