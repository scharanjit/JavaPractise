package newProblems;
import java.util.*;

public class permutate {
	public static void main(String[] args) {
		String s="khali";
		
		permu("",s);
	}

	public static void permu(String stringa, String s) {
		
		if(s.length()<=1)
		{
			System.out.println(stringa+s);
		}
		else
		{
			for(int i=0;i<s.length();i++)
			{
			String newString= s.substring(0,i)+s.substring(i+1);
			permu(stringa+s.charAt(i),newString);
			
			}
		}
		
		
	}

}
