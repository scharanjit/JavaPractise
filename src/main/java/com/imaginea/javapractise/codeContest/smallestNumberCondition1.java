package codeContest;

public class smallestNumberCondition1
{
	public static void main(String[] args) {
		System.out.println(smallest_number(2345));
	}
	public static int smallest_number(int input1)
	{
		int[] refAns=new int[4];
		refAns=answers(input1);
		int finalAns;
		
		for(finalAns=input1+1; finalAns<1000000000;finalAns++)
		{
			int[] ans=answers(finalAns);
			if((refAns[0]==ans[0]&&refAns[1]>=ans[1]) && (refAns[2]==ans[2]&&refAns[3]>=ans[3]))
			break;		
		}
			
		return finalAns;
		
		
		
	}
	
	public static int[] answers(int num)
	{		
		int[] addAns=add(num);
		int[] multAns=multiply(num);
		
		
		
		int[] answer={addAns[0],addAns[1],multAns[0],multAns[1]};
		return answer;
	} 
	
	public static int[] add(int num)
	{
		int addition=num;
		int itr=0;
		while(addition>9)
		{
			int temp=addition;
			addition=0;
			while(temp>0)
			{
			addition+=temp%10;
			temp=temp/10;			
			}
			itr++;
		}
		int[] addAns=new int[]{addition,itr};
		return addAns;
	}
	
	public static int[] multiply(int num)
	{
		int multiply=num;
		int itr=0;
		while(multiply>9)
		{
			int temp=multiply;
			multiply=1;
			while(temp>0)
			{
			multiply*=temp%10;
			temp=temp/10;			
			}
			itr++;
		}
		int[] multAns=new int[]{multiply,itr};
		return multAns;
	
	} 
}