package hihi;

public class RandomCard {
public static void main(String[] args) {
	

	
	 int CARDS = 52;
	int card[]= new int[CARDS]; 
	int i;
	int deck_cards=0;
	
	for (i=0; i< CARDS; i++){
	  card[i]=i;
	
	deck_cards = CARDS;
	}
	
	
	for (i=0; i<5; i++)
	{
	  
	  int r = (int) (Math.random()* deck_cards);
	 
	  
	  int temp = card[r];
	 // System.out.println(temp);
	  card[r] = card[deck_cards-1];
	  ////System.out.println("deck"+card[deck_cards-1]);
	  card[deck_cards-1] = temp;
	 
	  deck_cards--;
	}
	
	for (i=0; i<5; i++)
	{
	  System.out.println("The random extracted card["+i+"]= "+card[deck_cards+i]);
	}
}
}