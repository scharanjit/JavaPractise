package codeContest;

import java.util.Scanner;

public class Pillow {

	
	/* Dont know why they called it as a medium level problem after that Bitonic problem (Easy level) which ruined a
	 *  couple of days of my life.. :(

Lets come to the problem, its a very easy problem to solve. A new programmer would face only one problem i.e to
 start the loop from first position when we reach the end of our sequence.

Here`s the logic :
i) First we declare an array with the number of persons (input1) and fill it with n mber of person.

ii) Then, as the games starts and a person gets out, that position is to be marked as 1. 
Because while the next round this position needs to be ignored as the person is already out.

ii) Continue till only a single person remains.

The tricky point here is, how to traverse through the loop. The answer to this is, 
just maintain a flag which is updated only when we encounter a 0 at that position in the
 array else just move on until flag becomes equal to input2. In case, we reach the end of array,
  start from 1 again without resetting the flag.

If you have doubts or you want the source code for reference the comment below with your email address.

 */
	public static int getwinner(int input1, int input2 ){
		int brr[]=new int[input1+1];
		int temp;
		for(int i=1;i<=input1;i++){
			brr[i]=i;
		}
		System.out.println(brr[0]+" "+brr[1]+" "+brr[2]+" "+brr[3]+" "+brr[4]+" ");
		for(int i=1;i<input1;i++)
		{
			
			//circular movement ..input 2 is song length
			for(int j=1;j<input2;j++)
			{
				temp=brr[1];

				for(int k=1;k<brr.length-1;k++)
				{
					brr[k]=brr[k+1];
				}
				brr[brr.length-1]=temp;
			}
			//if time 5 seconds ...loop moved 5 times
			
			for (int a = 0; a < brr.length; a++)
			{
				if (a ==0 )
				{
					//System.out.println("flag");
					int[] copy = new int[brr.length-1];
					System.arraycopy(brr, 0, copy, 0, a);   // brr value copied is "copy" array from index 0 to index a
					System.arraycopy(brr, a+1, copy, a, brr.length-a-1);
					brr=copy;
					//System.out.println(brr[0]+" "+brr[1]+" "+brr[2]+" "+brr[3]+" "+brr[4]+" ");
					//System.out.println(copy[0]+" "+copy[1]+" "+copy[2]+" "+copy[3]+" "+copy[4]+" ");
					//System.out.println(brr);
				}
			}

		}
		return brr[1];
	}
	public static void main(String []args){
		System.out.println("Enter the Number of Players:");
		Scanner input=new Scanner(System.in);
		int player=input.nextInt();
		System.out.println("Enter the length of  song:");
		int song=input.nextInt();
		System.out.println("Winner is: "+getwinner(player, song)+" number player.");
	}

}

// take one array & fill it with person number 1,2,3,4,5,6,7,8,9,10,11
//travesre a master for loop for each person
//inside master create circular for loop as in duration of song concept
//now need to find the remaining 

