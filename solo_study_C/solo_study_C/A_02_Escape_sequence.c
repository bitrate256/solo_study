#include<stdio.h>
/*
제어문자

\b : 커서를 한칸 앞으로 이동(backspace)
\n : 커서를 다음줄의 맨 앞으로 이동(new line)
\r : 커서를 맨 앞으로 이동
\t : 커서를 탭 간격만큼 이동
\\ : \ 문자 자체를 출력
\" : " 문자 자체를 출력
%% : % 문자 자체를 출력
 */

int main() // 메인 함수 이다.
{
	printf("ABC\dDEF\n");
	printf("가나다\r라마바\n");
	printf("홍\t길\t동\n");
	printf("\'하하하\"\n");
	printf("1000%%\n");
	return 0; // 
}