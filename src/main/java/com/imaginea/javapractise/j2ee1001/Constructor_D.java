package j2ee1001;

class Ass 
{   int i; 
    Ass() 
    {       System.out.println("A's Constructor called."); 
    } 
} 
class Bss extends Ass 
{   Bss() 
    {       super(); 
            System.out.println("B's Constructor Called"); 
    } 
} 
public class Constructor_D 
{   public static void main(String s[]) 
    {       Bss b1 = new Bss();           
    } 
} 
