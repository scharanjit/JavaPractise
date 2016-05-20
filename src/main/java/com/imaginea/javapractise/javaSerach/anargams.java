/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaSerach;

import java.net.MalformedURLException;
import static java.rmi.Naming.list;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author charanjit.singh
 */
public class anargams {

    public static void main(String[] args) {
// TODO Auto-generated method stub 
        String[] stringSet = new String[]{"car", "arc", "art", "arct", "rac","bat","tab"};
       

    }

    public void findAnagram(String[] strings, String s) {
        HashMap<String, List<String>> map = new HashMap<String, List<String>> ();
        for (String element: strings) {
                  List<String> value;
              if (map.containsKey(sort(element))) {value = map.get(sort(element)); }
                else {value = new LinkedList<String>();}
                value.add(element); 
                map.put(sort(element), value);
        }
        printAnagrams(s, map);
}
public String sort(String s) {
       char[] array = s.toCharArray();
       Arrays.sort(array);
       return new String(array);
}

public void printAnagrams(String s, HashMap<String, List<String>> map) {
     if(map.containsKey(sort(s))) {
        for (String anagram: map.get(sort(s)).toArray(new String[0])) {
              System.out.println("anagram of s: "+ anagram);
        }
     }

}
}
