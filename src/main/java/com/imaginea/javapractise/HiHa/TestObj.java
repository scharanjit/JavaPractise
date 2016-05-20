package HiHa;

public class TestObj 
{
    public static void main (String [] args) 
    {
        Object o = new Object() /* Line 5 */
        
        {
            public boolean equals(Object obj) 
            {
                return false;
            } 
        };      /* Line 11 */
        
        System.out.println(o.equals("Fred"));
    }
}