package codeContest;


import java.util.Scanner;




public class  LongestIncreasingSubsequence

{

	/** function lis **/

	public int[] lis(int[] X)
	{   
		int n = X.length - 1; //5

		int[] M = new int[n + 1];  

		int[] P = new int[n + 1]; 

		int L = 0;



		for (int i = 1; i < n + 1; i++) //1

		{

			int j = 0;
			for (int pos = L ; pos >= 1; pos--)
			{
				//System.out.println(X[M[pos]]+"   "+X[i]);
				
				if (X[M[pos]] < X[i])
				{
				//	System.out.println("TRUE");
					j = pos;
					break;
				}
			}  
			
			P[i] = M[j];  //0
			//System.out.println("P[i] : "+P[i]+  " i :- "+i+"  L:-"+L+"   j:-> "+j);
			if (j == L || X[i] < X[M[j + 1]])
			{
				M[j + 1] = i;
				L = Math.max(L,j + 1);
				//System.out.println("max L:- "+L);
			}
		}

		int[] result = new int[L];
		int pos = M[L];
		for (int i = L - 1; i >= 0; i--)
		{
			result[i] = X[pos];
			pos = P[pos];
			// System.out.println(result[i]);
		}
		
		for (int i=0;i<=n;i++){System.out.print(M[i]);}
		System.out.println();
		for (int i=0;i<=n;i++){System.out.print(X[i]);}
		System.out.println();
		for (int i=0;i<=n;i++){System.out.print(P[i]);}
		
		return result;   
	}



	/** Main Function **/

	public static void main(String[] args) 

	{    

		
		Scanner scan = new Scanner(System.in);
		//System.out.println("Longest Increasing Subsequence Algorithm Test\n");
		//System.out.println("Enter number of elements");

		//int n = scan.nextInt();
	//	int[] arr = new int[n + 1];

	//	System.out.println("\nEnter "+ n +" elements");

	//	for (int i = 1; i <= n; i++)

		//	arr[i] = scan.nextInt(); 



		LongestIncreasingSubsequence obj = new LongestIncreasingSubsequence(); 

		int arr[]={8,2,6,4,5,1};
		//int arr[]={1,2,3};
		int[] result = obj.lis(arr);       



		/** print result **/ 



		System.out.print("\nLongest Increasing Subsequence : ");

		for (int i = 0; i < result.length; i++)

			System.out.print(result[i] +" ");

		System.out.println();

	}

}