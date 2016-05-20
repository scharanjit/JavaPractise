package codeContest;

import java.io.*;
public class Hexagoonal
{
	public static int goodHexa(int input1,int input2,int input3,int input4)
	{
		int count=0,N,L,X,K;
		N=input1;  //number of sticks 
		L=input2;	//length of longest stick
		X=input3;   // length of other sticks except L
		K=input4;	// repeat length factor
		int i1,i2,i3,i4,i5,i6;
		i4=-1;
		i5=-2;

		i6=N-L+1;

		for(i1=1;i1<=X;i1++)
			for(i2=i1;i2<=X;i2++)
				for(i3=i2;i3<=X;i3++)
					for(i4=i3;i4<=X;i4++)
						for(i5=i4;i5<=X;i5++)
							for(i6=L;i6<=N;i6++)
								if(findRepeat(i1,i2,i3,i4,i5)<=K)
								{	



									if(i1+i2+i3+i4+i5>i6)
									{
										count++;

									}
								}


		if(count==0)
			count=-1;
		else
			count=count%1000000007;

		return count;

	}

	public static int findRepeat(int i1, int i2, int i3, int i4, int i5)
	{
		int max=-1;
		int count=0;
		int i,j;

		int a[]={i1, i2, i3, i4, i5};


		for(i=0;i<a.length;i++)
		{
			count=0;
			for(j=i+1;j<a.length;j++)
				if(a[i]==a[j])
					count++;
			if(max<count)
				max=count;
			
			
			System.out.println(max);
		}

		return max+1;
	}
	
	public static void main(String[] args) {
		System.out.println(goodHexa(10, 8, 6, 2));
	}
	
} 