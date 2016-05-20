package HiHa;

public class ballweight {
	
	public static void main(String[] args) {
		int ballwt[]={4,4,4,4,4,4,4,6,4};
		int var1=0;
		var1=ballwt[0]+ballwt[1]+ballwt[2];
		int var2=0;
		var2=ballwt[3]+ballwt[4]+ballwt[5];
		int var3=0;
		var3=ballwt[6]+ballwt[7]+ballwt[8];
		int i=0;
		
		if(var1 ==var2 && var2==var3 && var1==var3 )
		{
			System.out.println("All balls are of equal weight");
			System.exit(0);
		}
		
		else if(var1==var2)
		{
			i=6;
			
		}
		
		else if(var1==var3)
		{
			i=3;
		}
		
		else if(var2== var3)
		{
			i=0;
		}
		
		
		int k=0;
		
			var1=ballwt[i];
			var2=ballwt[i+1];
			var3=ballwt[i+2];
		
		if(var1==var2)
		{
			k=i+2;
			
		}
		
		else if(var1==var3)
		{
			k=i+1;
			
		}
		
		else if( var2 == var3)
		{
			k=i;
		}
		
		else
		{
					}
		int m=k+1;
		System.out.println("Index of odd ball is "+k+" & the position of ball is :"+m);
		
		}
		
	}


