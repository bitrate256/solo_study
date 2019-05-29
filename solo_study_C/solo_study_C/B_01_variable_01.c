#include <stdio.h>
/*
상수
상수는 요컨데 일종의 변수와 같다.
하지만 변치 않는 값이다.
기억하기 힘든 값에 이름을 붙이거나, 특정한 입력값이 필요한데
의도에 맞는 임의의 수치를 넣어야 할때 사용할수 있다.
한번만 사용되고 없어진다.
값 자체를 직접 사용하는 '리터럴 상수'와 #define 문으로 정의되는 '매크로 상수'로 나뉜다.
 */
/*
자료형 (data type)
메모리를 선언하고 이 메모리의 '크기'와 저장된 숫자의 '용도(종류)'를 보여준다.
 */
int main()
{
	printf("sizeof(char) = %d\n", sizeof(char));
	// sizeof(char) = 1

	printf("sizeof(short) = %d\n", sizeof(short));
	printf("sizeof(short int) = %d\n", sizeof(short int));
	printf("sizeof(int) = %d\n", sizeof(int));
	printf("sizeof(long) = %d\n", sizeof(long));
	printf("sizeof(long int) = %d\n", sizeof(long int));
	// sizeof(short) = 2
	// sizeof(short int) = 2
	// sizeof(int) = 4
	// sizeof(long) = 8
	// sizeof(long int) = 8

	printf("sizeof(float) = %d\n", sizeof(float));
	printf("sizeof(double) = %d\n", sizeof(double));
	printf("sizeof(long double) = %d\n", sizeof(long double));
	// sizeof(float) = 4
	// sizeof(double) = 8
	// sizeof(long double) = 16

	return 0;
}