package hihi;

public class RedCard {

	
	public static void main(String[] args) {
		int CARDS=52;
		String card[]= new String[52];
		
		for(int i=0;i<CARDS;i++)
		{
			if(i<CARDS/4)
			{
			card[i]="r1";
			}
			else if(i>=CARDS/4 && i<(CARDS)/2)
			{
				card[i]="r2";
			}
			else if(i>=CARDS/2 && i<(3*CARDS)/4 )
			{
				card[i]="b2";
			}
			else
			{
				card[i]="b2";
			}
			
		}
		
		for(int j=0;j<CARDS;j++)
		{
		//	System.out.println(j+ "=  "+card[j]);
		}
		
	
	//card drawn is red
		int r =(int) (Math.random()*CARDS);
		
	if(card[r].equals("r1") || card[r].equals("r2"))
	{
		System.out.println("The card "+card[r]+" is red with index "+r);
	}
	
	else
	{
		System.out.println("The card "+card[r]+" is BLACK with index "+r);
	}
	}
	
	
	
	
	
}
	
	
	
	

