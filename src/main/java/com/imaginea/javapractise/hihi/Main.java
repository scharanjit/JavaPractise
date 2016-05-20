package hihi;

public class Main {

    public static void main(String[] args)
    {
        Deck deck = new Deck();
        Card C;

        System.out.println( deck.getTotalCards() );

       while (deck.getTotalCards()!= 0 )
       {
           C = deck.drawFromDeck();
           System.out.println( C.toString() );
       }
    }
}