package codeContest;


/*
 * 
 *  Assume we have total 5 judges which had given the point as [5 4 3 2 5] .
The middle one is 3rd in position with score 3 . So we have to add this one in the total score.
 Now one person is moving left means , he will go to 2nd Position and another person will go to 4th position
  and check if scores are same . In our case they are 4 and 2 which are not same , so it will not be added to
   total scroe and finally both will reach to the end , in our case the scores are 5 and 5 so we have the match
    so we will add . So total score 3 + 5 = 8 . So if you start from the first position 
    (in collection of array it will be index 0 ) , it need to be compared with the last score i.e. 5th in
     position ( in array 4 as index) . So solution is to start looping through the data from starting till
      the middle and with each iteration we need to compare the first to last , second to second last.
       So technically increase position 
 *  from one side and decrease the position from opposite side till we reach middle.*/

public class FashionContest {

	public static int fashion(int[] input1)
	{
		int totalScore = 0;
		int totalJudges = input1.length;
		int middlePoint = (totalJudges + 1) / 2;
		int endIndex = totalJudges - 1;
		for (int startIndex = 0; startIndex < middlePoint; startIndex++, endIndex--)
		{
			if (input1[startIndex] == input1[endIndex])
			{
				totalScore = totalScore + input1[startIndex];
			}
		}
		return totalScore;
	}
	
	public static void main(String[] args) 
	{
		int a[]={5,4,6,1,51};
		fashion(a);
		
		System.out.println(fashion(a));
	}



}
