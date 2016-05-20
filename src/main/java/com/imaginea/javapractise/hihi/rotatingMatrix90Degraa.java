package hihi;

import java.util.Scanner;

public class rotatingMatrix90Degraa {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter the size of matrix :");
		int m= scan.nextInt();
		int n= scan.nextInt();
		int a[][]=new int[m][n];
				for(int i=0; i<m; i++)
			{
			for (int j=0; j<n;j++)
			{
			a[i][j]=(int) (Math.random()*100);
		
			System.out.print(" "+a[i][j]);
			}
			System.out.println(" ");
			}
		
				System.out.println("--------------------------------------------->>>>>> ");
		for(int i=1;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				int temp= a[j][i];
				a[j][i]=	a[i][j];
				a[i][j]=temp;
				//System.out.print(" "+a[i][j]);
			}
			//System.out.println(" ");
		}
		System.out.println("--------------------------------------------->>>>>> ");
		
		 for ( int i = 0; i < m; i++ ) {
		        for ( int j = 0; j < n/2; j++ ) {
		            int tmp = a[i][j];
		            a[i][j] = a[i][n-1-j];
		            a[i][n-1-j] = tmp;
		        }
		    }
		
		 System.out.println("--------------------------------------------->>>>>> ");
		 for(int i=0; i<m; i++)
			{
			for (int j=0; j<n;j++)
			{
			//a[i][j]=(int) (Math.random()%100);
			System.out.print(" "+a[i][j]);
			}
			System.out.println(" ");
			}
		
		
	}

}
