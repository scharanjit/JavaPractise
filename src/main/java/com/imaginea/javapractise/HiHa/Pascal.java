package HiHa;


public class Pascal
{
	int i,j,k,l=1;
	void PrintPascal(int n)
	{
		for (i=1;i<=n;i++)
		{
			for(j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(k=0;k<i;k++)
			{
				System.out.print(i +" " );
			}
			System.out.println();
		}
	}
	
	public static void main (String[] args)
	{
		Pascal p=new Pascal();
		p.PrintPascal(5);
	}
}