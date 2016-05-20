package codeContest;

public class smallestNumberCondition {
	public static void main(String[] args) {
		System.out.println(smallest_number(101));
	}

	public static int smallest_number(int input1)
	{
		int n1 = 0, n2 = 0;
		int value, steps = 0;

		int d1 = MultiplyToOneDigit(input1, n1);  //one digit number by multiplying
		int	d2 = SumToOneDigit(input1, n2); 		// one digit number by adding
		
		for (int i = input1 + 1; i < 1000000000; i++)
		{

				System.out.println(i);
			value = MultiplyToOneDigit(i, steps);
			if (value != d1 || steps > n1) continue; // no good

			value = SumToOneDigit(i, steps);
			if (value != d2 || steps > n2) continue; // no good

			return i;
		}
		return -1; // no answer
	}
	static int MultiplyToOneDigit(int value,int steps)
	{
		steps = 0;
		while (value > 10)
		{
			value = MultiplyDigits(value);
			steps++;
		}
		System.out.println("Multiply Step Count "+steps);
		return value;
	}
	static int SumToOneDigit(int value,  int steps)
	{
		steps = 0;
		while (value > 10)
		{
			value = SumDigits(value);
			steps++;
		}
		System.out.println("ADD Step Count      "+steps);
		System.out.println();
		return value;
	}
	static int MultiplyDigits(int value)
	{
		int acc = 1;
		while (value > 0)
		{
			acc *= value % 10;
			value /= 10;
		}
		return acc;
	}
	static int SumDigits(int value)
	{
		int total = 0;
		while (value > 0)
		{
			total += value % 10;
			value /= 10;
		}
		return total;
	}

}
