import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;




public class arraysort {
	int l=9;
	enum saa
	{
		BIG,GREEn,ZILLA;
		//enumeration constant
		
		void Hello()
		{
			
		}
		//enumeration method
		saa()
		{
			
		}
		
		//enumeration constructor
	}
	public static void main(String[] args) {
		System.out.println(saa.values());
		//saa c = new saa();
		
		
		int []a= new int[10];
		
		//int []b = null;
		for (int i=0;i<10;i++)
		{
			a[i]=i;
			//b[i]=i;
			System.out.println("a["+i+"]:-"+a[i]);
		}
		
		
		List ap = new ArrayList();
		
		ap.add(1);
		ap.add(2);
		ap.add(0);
		
		System.out.println(ap);
		Collections.sort(ap);
		System.out.println(Collections.binarySearch(ap, -2));
		
		System.out.println(ap);
	}
		

}
