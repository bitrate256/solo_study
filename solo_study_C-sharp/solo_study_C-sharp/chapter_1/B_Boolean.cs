using System;

namespace solo_study_C_sharp
{
    class B_Boolean
    {
        /* if문
         * if(조건식)
         *    조건식이 참인 경우 실행되는 코드;
         *    
         *   조건식은 bool 형식이어야 함. 여기서 bool은 대수체계인 '부울대수'에 포함되는 키워드.
         *   나아가 불리언(boolean) 자료형은 참과 거짓을 나타내는 논리 자료형임. 추후 필요시 다시 설명함.
         *   
         *   참인 경우 실행되는 코드가 2줄 이상일 영우에는 블록을 지정할 수 있음.
         *   if(조건식)
         *   {
         *      조건식이 참인 경우 실행되는 코드1;
         *      조건식이 참인 경우 실행되는 코드2;
         *      조건식이 참인 경우 실행되는 코드3;
         *   }
         *   
         *   if else 문
         *   조건이 참이 아닌 경우에 실행가능한 블록임.
         *   if(조건식)
         *      조건식이 참인 경우 실행되는 코드;
         *   else
         *      조건식이 거짓인 경우 실행되는 코드;
         *   
         *   if else if
         *   else if 문도 있음.
         *   처음 if문이 거짓일 경우 else if 문에서 다른 조건을 검사할 수 있음.
         *   if (a < 0)
         *       Console.WriteLine("음수");
         *   else if (a > 0)
         *       Console.WriteLine("양수");
         *   else
         *       Console.WriteLine("0");
         */

        /* switch 문
         * int 값에 따라 일치여부를 판단하여 실행할 구역(case)을 식별함.
         * 조건이 같고 값이 세가지 이상일 때 활용됨.
         * break는 중괄호 {} 구문을 나간다.
         * 즉, case 안에서 실행될 경우 switch의 중괄호를 나간다는 뜻이다.
         * 
         * switch (int 변수)
         * {
         *     case 상수{0}:
         *         // 사용될 명령어 //
         *         break;
         *     case 상수{1}:
         *         // 사용될 명령어 //
         *         break;
         *     case 상수{2}:
         *         // 사용될 명령어 //
         *         break;
         *     defult:
         *         // 사용될 명령어 //
         *         break;
         * }
         * 
         */
        static void Main(string[] args)
        {
            Console.Write("숫자를 입력하세요 : ");

            // Console.ReadLine의 반환값은 srting 타입이기 때문에 아래와같이 변환해서 사용
            string input = Console.ReadLine();
            int number = Int32.Parse(input);

            // 기본적인 if문
            if (number > 10)
                Console.WriteLine("조건식이 참일 경우 코드가 실행된다.");

            // if문의 블록 지정.
            if (number > 10)
            {
                Console.WriteLine("조건식이 참일 경우 실행되는 코드1");
                Console.WriteLine("조건식이 참일 경우 실행되는 코드2");
                Console.WriteLine("조건식이 참일 경우 실행되는 코드3");
            }
            if (number < 0)
                Console.WriteLine("음수");
            else if (number > 0)
                Console.WriteLine("양수");
            else
                Console.WriteLine("0");

            if (number % 2 == 0)
                Console.WriteLine("짝수");
            else
                Console.WriteLine("홀수");

            // 중첩으로 if문을 쌓을 수 도 있지만 가독성이 나빠질 확률이 있다.
            if (number > 0)
            {
                if (number % 2 == 0)
                    Console.WriteLine("0보다 큰 짝수");
                else
                    Console.WriteLine("0보다 큰 홀수");
            }
            else
                Console.WriteLine("0보다 작거나 같은 수");

            // 
            switch (number)
            {
                case 10:
                    Console.WriteLine("case가 10일 경우 출력되는 구문");
                    break;
                case 20:
                    Console.WriteLine("case가 20일 경우 출력되는 구문");
                    break;
                case 30:
                    Console.WriteLine("case가 30일 경우 출력되는 구문");
                    break;
                default:
                    Console.WriteLine("case가 없고 default일 경우 출력되는 구문");
                    break;
            }
        }
    }
}