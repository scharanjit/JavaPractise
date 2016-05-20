package j2ee1001;

public class temp
{
	static int i;
	static int j;
	public static void main(String a[])
	{
		outer:
			for(i=1;i<3;i++)
			{
				inner:
					for(j=1;j<3;j++)
					{
						if(j==2)
						{
							System.out.println(i +" "+j);
							continue outer;
							//System.out.println(i +" "+j); --> NOT ALLOWED
							
						}
					}
			}
	}
}

