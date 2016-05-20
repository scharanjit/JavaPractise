package codeContest;

import java.util.Arrays;

public class dividingProblem {
	public static void main(String[] args) {
		int[] bb={1,1,2,2};
		subSet(bb);

	}

	static void subSet(int array[]) {
		System.out.println("Input elements  :" + Arrays.toString(array));

		int sum = 0;
		for (int element : array)
		{
			sum = sum + element;
		}
		if (sum % 2 == 1) 
		{
			System.out.println("Invalid Pair");
			return;
		}

		Arrays.sort(array);
		System.out.println("Sorted elements :" + Arrays.toString(array));

		int subSum = sum / 2;

		int[] subSet = new int[array.length];
		int tmpSum = 0;
		boolean isFastpath = true;
		int lastStopIndex = 0;
		for (int j = array.length - 1; j >= 0; j--)
		{
			tmpSum = tmpSum + array[j];
			if (tmpSum == subSum)  //temporary sum == sub sum
			{ // if Match found
				if (isFastpath) 
				{ // if no skip required and straight forward
					// method
					System.out.println("Found SubSets ");
					
					for(int m=0;m<=j-1;m++)
					{
						System.out.print(array[m]+",");
					}
					System.out.println();
					
					System.out.println(array[array.length-1]);
					
				} 
				else 
				{
					subSet[j] = array[j];
					array[j] = 0;
					System.out.println("Found..");
					System.out.println("Set 1" + Arrays.toString(subSet));
					System.out.println("Set 2" + Arrays.toString(array));
				}
				return;
			}
			
			else {
				// Either the tmpSum greater than subSum or less .
				// if less , just look for next item
				if (tmpSum < subSum && ((subSum - tmpSum) >= array[0]))
				{
					if (lastStopIndex > j && subSet[lastStopIndex] == 0) 
					{
						subSet[lastStopIndex] = array[lastStopIndex];
						array[lastStopIndex] = 0;
					}
					lastStopIndex = j;
					continue;
				}
				isFastpath = false;
				if (subSet[lastStopIndex] == 0) {
					subSet[lastStopIndex] = array[lastStopIndex];
					array[lastStopIndex] = 0;
				}
				tmpSum = tmpSum - array[j];
			}
		}

	}
}