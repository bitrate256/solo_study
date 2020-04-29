#include <stdio.h>
/*
 출력 결과 확인.
 */
func(int* p) {
	printf("%d\n", *p);
	printf("%d\n", p[2]);
}
main() {
	int a[7] = { 1,2,3,4,5 };
	func(a);
	func(a + 2);
}