package orc;

import java.lang.Thread;
import java.lang.Object;

import OCJPChap5.Circles;
public class starproject {

	public static void main(String[] args) {
		drawStar(30);
		System.out.println("");
		//drawSquare(30);
		System.out.println("");
		drawBoder(30);
		System.out.println("");
		
		
	}

	

	private static void drawBoder(int o) {
		for(int i=0;i<o;i++)
		{
			for (int j=0;j<o ;j++)
			{
				if(i==0 || i==(o-1))
				{
					System.out.print("*"+" ");
				}
				
				else if (j==0 || j==(o-1))
				{
					System.out.print("*"+" ");
				}
				else
				{
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
	}

	private static void drawSquare(int n) {
		for(int i=0;i<n;i++)
		{
			for (int j=0;j<n ;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();

		}

	}

	private static void drawStar(int m) {

		for(int i=0;i<m;i++)
		{
			for(int k=m-1;k>i;k--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("*"+" ");
			}

			System.out.println();
		}

		for(int l=m-1;l>0;l--)

		{
			for(int k=m;k>l;k--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<l;j++)
			{
				System.out.print("*"+" ");
			}

			System.out.println();

		}

	}
}
