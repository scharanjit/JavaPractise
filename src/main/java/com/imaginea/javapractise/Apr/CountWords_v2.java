package Apr;

import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set; 

public class CountWords_v2{

    public static void main(String[] args) throws IOException {

    	Scanner sc = new Scanner(System.in);
    	System.out.println(sc.nextLine());
        String inputLine = null;

        LinkedHashMap dictionary = new LinkedHashMap();

        while((inputLine = sc.nextLine()) != null)
        {

            // Split the input line.
        	

            String[] words = inputLine.split("\\s+");

               // Ignore empty lines.
 
            if(inputLine.equals(""))

                continue;

             

            for(String word: words) {

                // Remove any commas and dots.

                word = word.replace(".", "");

                word = word.replace(",", "");

                 

                if(dictionary.containsKey(word)) {

                    Integer val = (Integer) dictionary.get(word);

                    dictionary.put(word, val + 1);

                }

                else

                    dictionary.put(word, 1);

            }

        }

       
        // Printing all words stored in the map.

        Set<Entry> entries = dictionary.entrySet();

        Iterator<Entry> iter = entries.iterator();

         

        while(iter.hasNext()) {

            Entry entry = iter.next();

            System.out.println(entry.getKey() + ": " + entry.getValue());

        }

     
       // sc.close();

    }

}
