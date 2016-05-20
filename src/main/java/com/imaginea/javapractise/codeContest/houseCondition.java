package codeContest;

public class houseCondition {

	public static int house_condition(int[] input1,int input2)
	{
		int[] score = new int[input1.length];   
		for(int i=0;i<input1.length;i++)
		{
			if(i == 0)
			{
				score[i] = 1; //first house in good condition

				if(i+1<input1.length)
				{
					score[i+1] = input1[i]- score[i];   
				}
			}
			else
			{
				if(i+1<input1.length)
				{   
					score[i+1] = input1[i] - (score[i-1] + score[i]);
				}
			}
		}
		return score[input2-1]; 
	}
	
	public static void main(String[] args) {
		int scoreList[]={2,2,1,1,1};
		
		int houseNumber=4;
		
		System.out.println("Condition of house is "+house_condition(scoreList, houseNumber));
	}
}
