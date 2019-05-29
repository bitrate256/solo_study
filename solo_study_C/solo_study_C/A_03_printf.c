#include<stdio.h>
/*
printf("서식문자", 인수1, 인수2, ...);
printf("%d \n", 1234); -> "1234 \n"
 */

int main()
{
	printf("ABC\dDEF\n");
	printf("가나다\r라마바\n");
	printf("홍\t길\t동\n");
	printf("\'하하하\"\n");
	printf("1000%%\n");
	return 0; // 
}