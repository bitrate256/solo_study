using System;

namespace solo_study_C_sharp
{
    class A_Data_type
    {
		/* 리터럴 데이터 */
        /* C# 에서는 값을 직접 쓰는 것이 가능하다. 이를 리터럴 데이터라고 한다.
		 * 별도 접미어(suffix)가 없을 때 int, double, char 등의 데이터 타입에 직접 할당한다.
		 * 별도의 지정 접미어를 추가한다면 데이터값을 특정할 수 있다.
		 * 접미어에 있어서 대소문자 구분은 없다. ex) 123M == 123m
		 */
	    /*
        123 // int 리터럴
		123.45 // double 리터럴
		"A"; // string 리터럴
		'a'; // char 리터럴
		true // bool 리터럴
        */
        // bool
        bool b = true;
        // Numeric
        short ab = -12345;
        int i = 12345;
        long l = 1234L; // L suffix
        float f = 123.45F; // F suffix
        double d1 = 123.45F;
        double d2 = 123.34D; // D suffix
        decimal d = 123.45M; // M suffix
        
		// char / string
        char c = 'A';
        string s = "Hello";

        // datetime 2019-05-20 17:55
        DateTime dt = new DateTime(2019, 05, 20, 17, 55, 0);


        int im = int.MaxValue;
        float fm = float.MinValue;
        /* 숫자형 데이터 타입의 최댓값 혹은 최솟값을 알아내기 위해서는 .NET 데이터타입 클래스들의
		 * MaxValue, MinValue 프로퍼티를 사용합니다. C# 데이터타입 키워드 뒤에서도 이러한 프로퍼티를 직접 호출할 수 있습니다.
		 * int,MaxValue / int32.MaxValue
		 */

        /* Null */
        /* 어떤 변수가 아무 데이터도 갖고 있지 않다는 것을 Null 이라고 한다.
		 * 이를 표현하기 위해서는 소문자 null 이라는 키워드를 사용한다.
		 * 모든 데이터 타입이 null 을 가질 수 있는 것은 아니며,
		 * 데이터타입은 null을 가질 수 있는 Refference 타입과 가질 수 없는 Value 타입으로 구분된다. 
		 */
         /*
        string e;
		e = null;
        */
		/* Nullable Type */
		/* 정수나 날짜 같은 Value Type은 null을 가질 수 없지만 2.0 버전 부터 가질 수 있게 되었다.
		* 이를 Nullable Type 이라고 부른다
		*/
        /*
		// Nullable 타입
		int? f = null;
        f = 101;
        bool? g = null;

        //int? 를 int로 할당
        Nullable<int> h = null;
        h = 10;
        int k = h.Value;
        
        
        static void Main(string[] args)
    {
        Console.WriteLine("데이터 값에 관한 정리 입니다.");
    }
    }
}
*/