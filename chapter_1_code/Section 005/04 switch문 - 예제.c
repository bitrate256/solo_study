#include <stdio.h>
main()
// 점수에 따라 등급 표기.
{
    int jum = 85;
    switch (jum / 10)
    {
    case 10:
    case 9:
        printf("학점은 A입니다.\n");
        break;
    case 8:
        printf("학점은 B입니다.\n");
        break;
    case 7:
        printf("학점은 C입니다.\n");
        break;
    case 6:
        printf("학점은 D입니다.\n");
        break;
    default:
        printf("학점은 F입니다.\n");
    }
}