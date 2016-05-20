package OCJPChap7;

// cmnt & uncmnt the equals method
public class _3EqualsTest {

    public static void main(String[] args) {
        Moof one = new Moof(8);
        Moof two = new Moof(8);
        if (one.equals(two)) {
            System.out.println("one and two are equal");//the o/p will be no...if we dont override .equals
        } else {
            System.out.println("NO");
        }
    }
}

class Moof {

    private int moofValue;

    Moof(int val) {
        moofValue = val;
    }

    public int getMoofValue() {
        return moofValue;
    }

    public boolean equals(Object o) {
        if ((o instanceof Moof) && (((Moof) o).getMoofValue() == this.moofValue)) {   								// casting o is important
            return true;				    // unless compiler will think that o is reference of Object class
        } else {
            return false;
        }
    }
}
