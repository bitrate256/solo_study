#include<stdio.h>
/*
�����

\b : Ŀ���� ��ĭ ������ �̵�(backspace)
\n : Ŀ���� �������� �� ������ �̵�(new line)
\r : Ŀ���� �� ������ �̵�
\t : Ŀ���� �� ���ݸ�ŭ �̵�
\\ : \ ���� ��ü�� ���
\" : " ���� ��ü�� ���
%% : % ���� ��ü�� ���
 */

int main() // ���� �Լ� �̴�.
{
	printf("ABC\dDEF\n");
	printf("������\r�󸶹�\n");
	printf("ȫ\t��\t��\n");
	printf("\'������\"\n");
	printf("1000%%\n");
	return 0; // 
}