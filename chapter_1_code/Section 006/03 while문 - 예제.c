#include <stdio.h>
/*
 1~5 까지 합을 구하는 프로그램. 결과 확인하시오.
 */
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