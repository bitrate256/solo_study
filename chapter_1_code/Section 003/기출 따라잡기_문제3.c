#include <stdio.h>
/*
main() {
	float a = 3.45678f;
	double b = 0.0561214;
	(?);
}
아래 출력이 나오도록 빈칸 채우기
[a]=3.46 / [b]=5.612e-02
*/
main() {
	float a = 3.45678f;
	double b = 0.0561214;
	printf("[a]=%.2f / [b]=%.3e", a, b);
}