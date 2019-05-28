#include <stdio.h>
/*
���
����� ������ ������ ������ ����.
������ ��ġ �ʴ� ���̴�.
����ϱ� ���� ���� �̸��� ���̰ų�, Ư���� �Է°��� �ʿ��ѵ�
�ǵ��� �´� ������ ��ġ�� �־�� �Ҷ� ����Ҽ� �ִ�.
�ѹ��� ���ǰ� ��������.
�� ��ü�� ���� ����ϴ� '���ͷ� ���'�� #define ������ ���ǵǴ� '��ũ�� ���'�� ������.
 */
/*
�ڷ��� (data type)
�޸𸮸� �����ϰ� �� �޸��� 'ũ��'�� ����� ������ '�뵵(����)'�� �����ش�.
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