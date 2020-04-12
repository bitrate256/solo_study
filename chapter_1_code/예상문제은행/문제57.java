public class Test {
	public static void main(String[] args) {
		int E[] = { 95, 75, 85, 100, 50 };
		int i = 0;
		int Temp = 0;
		do
		{
			int j = i;
			do
			{
				if (E[i] > E[j])
				{
					Temp = E[i];
					E[i] = E[j];
					E[j] = Temp;
				}
				j++;
			} while (j < 5);
			i++;
		} while (i < 4);
		for (int a = 0; a < 5; a++ )
		{
			System.out.printf(E[a]+"\t");
		}
	}
}