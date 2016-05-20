import java.util.ArrayList;
import java.util.List;

public class Dup {

	public static void main(String[] args) {
		List<Integer> i = new ArrayList<Integer>();
		
		for(int m=1;m<30;m++)
		{
			i.add(m);
		}
		
		i.add(22);
		System.out.println(i);
		System.out.println(findDuplicate(i));
	}

	public static int findDuplicate(List<Integer> i) {
		
		int highest=i.size()-1;
		System.out.println(highest);
		 int total = getTotal(i);
		 System.out.println(total);
		 int dupl= total-(highest*(highest+1)/2);
		 
		 System.out.println(dupl);
		 return dupl;
	}

	private static int getTotal(List<Integer> i) {
		// TODO Auto-generated method stub
		
		int  sum=0;
		for (int num:i)
		{
			sum+=num;
		}
		return sum;
	}
}
