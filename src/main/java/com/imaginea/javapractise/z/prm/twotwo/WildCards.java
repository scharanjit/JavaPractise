/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z.prm.twotwo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.naming.ldap.HasControls;

/**
 *
 * @author Charanjit.Singh
 */
public class WildCards {

    public static String printCollection(Collection c) {
        Iterator i = c.iterator();
        for (int k = 0; k < c.size(); k++) {
            System.out.print(" " + i.next() + " ");
        }
        return "Old Method";
    }

    public static String printCollection1(Collection<Object> c) {
        for (Object e : c) {
            System.out.print(" " + e + " ");
        }
        return "New Method";
    }

   public static String  printCollection2(Collection<?> c) {
        for (Object e : c) {
            System.out.print(" "+e+" ");
        }
        return "wildcards";
    }

    public static void main(String[] args) {
        Set<Object> s = new HashSet<Object>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        System.out.println(printCollection(s));
        System.out.println(printCollection1(s));

        //The problem is that this new version is much less useful than the old 
        //one. Whereas the old code could be called with any kind of collection
        //as a parameter, the new code only takes Collection<Object>, which, 
        // is not a supertype of all kinds of collections!..i.e. in CAse of Entity Type
        // so use wildcards
        
        System.out.println(printCollection2(s));
        
        Collection<?> c = new ArrayList<String>();
        //c.add(new Object()); // Compile time error
        //the add() method takes arguments of type E, the element type of the 
        //collection. When the actual type parameter is ?, it stands for some 
        //unknown type.
        
    }

}
