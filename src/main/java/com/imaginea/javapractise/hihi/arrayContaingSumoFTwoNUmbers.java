package hihi;

public class arrayContaingSumoFTwoNUmbers {

		public static void main(String[] args) {
			
			int numbers[]={1,2,3,4,5,6,7,8,9,0};
			int s=15;
			
			for (int i=0; i< numbers.length; i++)
			{
			    for (int j=i+1; j<numbers.length;j++)
			    {
			        if (numbers[i] < s)
			        {
			            if (numbers[i]+numbers[j] == s)
			            {
			            System.out.println("the numbers are "+numbers[i]+" "+numbers[j]);
			                }
			            }
			        }
			    }
			    //System.out.println("Not Exist");
		}
}
