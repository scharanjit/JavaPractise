package codeContest;
//lis:- increasing length of subarray ending at lis[i]
//lid:- decreasing lenght of subarray starting at lid[i]
public class BitonicArray {
	
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60};
		System.out.println(subs_array(arr));
	}

	public static int subs_array(int[] arr) {
		
		int	len=arr.length;
		int lis[] = new int [len];
		for(int m=0;m<len;m++)
		{
			lis[m]=1;
		}
		
		for(int i=1;i<len;i++)
		{
			for (int j=0;j<=i-1;j++)
			{
				if(arr[i]>arr[j] && lis[i]<lis[j]+1)
				{
					lis[i]=lis[j]+1;
				}
			}
			
		}
		for(int m=0;m<len;m++)
		{
			System.out.print(lis[m]);
		}
		System.out.println();
		
		int lid[] = new int [len];
		for(int m=0;m<len;m++)
		{
			lid[m]=1;
		}
		
		
		for(int i=len-2;i>=0;i--)
		{
			for (int j= len-1;j>=i+1;j--)
			{
				if(arr[i]>arr[j] && lid[i]<lid[j]+1)
				{
					lid[i]=lid[j]+1;
				}
			}
			
		}
		for(int m=0;m<len;m++)
		{
			System.out.print(lid[m]);
		}
		System.out.println();
		
		int max =lis[0]+lid[0]-1;
		
		for(int i=1;i<len;i++)
		{
			
			if(lis[i]+lid[i]>max)
			{
				max= lis[i]+lid[i]-1;
			}
		}
		
		return max;
		
	}

}
