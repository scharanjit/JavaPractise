package j2ee1001;
  public class Static_Demo 
{  public static void main(String args[]) 
{    int script = 6, acting = 9, directing = 8; 
     System.out.print("The rating of the movie is :"); 
     System.out.println(movieRating(script,acting,directing)); 
} 
public static int movieRating(int s, int a, int d) 
{    return s+a*d; 
} 
} 
