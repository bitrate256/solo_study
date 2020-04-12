#include <stdio.h>
main()
{
    int a = 0, hap = 0;
    while (a < 5)
    {
        a++;
        hap += a;
    }
    printf("%d, %d\n", a, hap);
}