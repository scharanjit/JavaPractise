package OCJPChap3;

public class CardBoard {

    Short story = 200;

    CardBoard go(CardBoard cb) {
        System.out.println(cb.hashCode());
        cb = null;
        //System.out.println(cb.hashCode());
        return cb;
    }

    public static void main(String[] args) {
        CardBoard c1 = new CardBoard();
        System.out.println("hashcode : -->  " + c1.hashCode());
        CardBoard c2 = new CardBoard();
        System.out.println(c2.hashCode());
        CardBoard c3 = c1.go(c2);
        System.out.println(c3); //therfefore c3 =null
        c1 = null;
        //	System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        // do Stuff
    }
}

//2
//after lien do stuff
// three refernce was created..only c2 object left...rest all destroeyed
