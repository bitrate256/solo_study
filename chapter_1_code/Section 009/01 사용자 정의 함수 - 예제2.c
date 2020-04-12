#include <stdio.h>
func(i, j);
main()
{
    int a = 3, b = 12;
    a = func(a, b);
    printf("%d, %d\n", a, b);

}
func(i, j)
int i, j;
{
    i *= 3;
    j /= 3;
    printf("%d, %d\n", i, j);
    return i;
}