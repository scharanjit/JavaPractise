package codeContest;

import java.util.Arrays;

public class teamInterview {


	public static String get_responce(int input1,int input2,String[] input3)
	{
		int len = input3.length;
		int[] opt = new int[input1];
		//Arrays.fill(input1,-9999);
		int answers[][] = new int[input2][2];
		if (len <= 0 || len != input2 || input1 < 1 || input2 < 1)
			return "No";
		for (int j = 0; j < input2; j++)
		{
			String[] ss = input3[j].split("#");
			if (ss.length != 2)
				return "No";
			int a = Integer.parseInt(ss[0]);
			int b = Integer.parseInt(ss[1]);
			int aa = Math.abs(a);
			int bb = Math.abs(b);
			if (aa > input1 || bb > input1 || aa == 0 || bb == 0)
				return "No";
			answers[j][0] = a;
			answers[j][1] = b;
			if (opt[aa - 1] == -999999)
				opt[aa - 1] = a;
			else
				opt[aa - 1] += a;
			if (opt[bb - 1] == -999999)
				opt[bb - 1] = b;
			else
				opt[bb - 1] += b;

		}
		for (int i = 0; i < input1; i++)
		{
			if (opt[i] == -999999)
				return "No";
			else if (opt[i]/(i+1) > 0)
				return "Yes";

		}
		return "No";
	}
	public static void main(String args[])
	{
		String[] ss = { "1#2", "2#3", "3#4", "-1#-3", "-2#-4" };
		String a = get_responce(4, 5, ss);
		System.out.println(a);
		String[] ss1 = { "1#2", "-1#2", "1#-2", "-1#-2" };
		String a1 = get_responce(3, 4, ss1);
		System.out.println(a1);
		String[] ss2 = {"1#2","1#3","-1#-3","2#3","3#-1"};
		String a2 = get_responce(3, 5, ss2);
		System.out.println(a2);
	}
}
