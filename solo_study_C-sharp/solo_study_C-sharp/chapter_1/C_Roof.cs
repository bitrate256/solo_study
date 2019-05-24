using System;

namespace solo_study_C_sharp
/* for(초기화; 조건식; 반복식;)
*     반복실행할 코드;
*/
/* for문은 초기식에 따라 조건식을 판단해 실행하고 변환식을 계산한다.
 * 후 다시 조건식을 검사하고 참이면 계속, 거짓이면 종료한다.
 * 반복할때마다 무엇인가를 더할때등, 지속적으로 값이 변화하거나 조건을 판단해야 할때 활용한다.
 * 요는 무한반복되는 상황을 만들면 안되는 것이다.
 * 영원히 실행된다면 CPU에 과부하가 걸리고 말것이다.
*/
{
    class Program
    {
        static void Main(string[] args)
        {
            for (int i = 0; i < 5; i++)
            {
                Console.WriteLine(i);
            }
        }
    }
}