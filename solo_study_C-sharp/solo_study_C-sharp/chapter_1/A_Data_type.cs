using System;

namespace solo_study_C_sharp
{
    class A_Data_type
    {
		/* ���ͷ� ������ */
        /* C# ������ ���� ���� ���� ���� �����ϴ�. �̸� ���ͷ� �����Ͷ�� �Ѵ�.
		 * ���� ���̾�(suffix)�� ���� �� int, double, char ���� ������ Ÿ�Կ� ���� �Ҵ��Ѵ�.
		 * ������ ���� ���̾ �߰��Ѵٸ� �����Ͱ��� Ư���� �� �ִ�.
		 * ���̾ �־ ��ҹ��� ������ ����. ex) 123M == 123m
		 */
	    /*
        123 // int ���ͷ�
		123.45 // double ���ͷ�
		"A"; // string ���ͷ�
		'a'; // char ���ͷ�
		true // bool ���ͷ�
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
        /* ������ ������ Ÿ���� �ִ� Ȥ�� �ּڰ��� �˾Ƴ��� ���ؼ��� .NET ������Ÿ�� Ŭ��������
		 * MaxValue, MinValue ������Ƽ�� ����մϴ�. C# ������Ÿ�� Ű���� �ڿ����� �̷��� ������Ƽ�� ���� ȣ���� �� �ֽ��ϴ�.
		 * int,MaxValue / int32.MaxValue
		 */

        /* Null */
        /* � ������ �ƹ� �����͵� ���� ���� �ʴٴ� ���� Null �̶�� �Ѵ�.
		 * �̸� ǥ���ϱ� ���ؼ��� �ҹ��� null �̶�� Ű���带 ����Ѵ�.
		 * ��� ������ Ÿ���� null �� ���� �� �ִ� ���� �ƴϸ�,
		 * ������Ÿ���� null�� ���� �� �ִ� Refference Ÿ�԰� ���� �� ���� Value Ÿ������ ���еȴ�. 
		 */
         /*
        string e;
		e = null;
        */
		/* Nullable Type */
		/* ������ ��¥ ���� Value Type�� null�� ���� �� ������ 2.0 ���� ���� ���� �� �ְ� �Ǿ���.
		* �̸� Nullable Type �̶�� �θ���
		*/
        /*
		// Nullable Ÿ��
		int? f = null;
        f = 101;
        bool? g = null;

        //int? �� int�� �Ҵ�
        Nullable<int> h = null;
        h = 10;
        int k = h.Value;
        
        
        static void Main(string[] args)
    {
        Console.WriteLine("������ ���� ���� ���� �Դϴ�.");
    }
    }
}
*/