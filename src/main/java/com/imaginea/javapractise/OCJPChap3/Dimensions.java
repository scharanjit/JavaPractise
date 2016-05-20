package OCJPChap3;

import java.awt.Dimension;

public class Dimensions {

    public static void main(String[] args) {
        Dimension a = new Dimension(5, 10);
        System.out.println("a.height = " + a.height);
        Dimension b = a;
        System.out.println("B points to a here : " + b.height);
        b.height = 30;
        System.out.println("a.height = " + a.height + " after change to b"); //as we change the value of b.
        //the value of a also got changed

        System.out.println("----------------------------------------");
        String x = "Java"; // Assign a value to x
        String y = x; // Now y and x refer to the same
        // String object
        System.out.println("y string = " + y);
        x = x + " Bean"; // Now modify the object using
        // the x reference

        System.out.println("y string = " + y);
        System.out.println("x String=" + x);
        //here string still refers to Java only
        //BUT STRINGS ARE IMMUTABLE

        System.out.println("**************************************");
        StringBuffer x1 = new StringBuffer("Java");

        StringBuffer y1 = x1;

        System.out.println("y1 :" + y1 + "  x1 : " + x1);

        x1.append(" Bean");

        System.out.println("New y1 :" + y1 + "   New x1 : " + x1);

    }
}
