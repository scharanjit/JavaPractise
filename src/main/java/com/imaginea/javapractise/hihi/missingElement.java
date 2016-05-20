package hihi;

public class missingElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[]={9,7,2,4,5,6,1,3,2,10};
		//order this array & find the missing element by removing duplicate
		//System.out.println(a.length);
		miss(a,a.length);
		
		for(int k =0; k<a.length; k++)
		{
			System.out.print(" "+a[k]);
		}
	
	}

	

	
	public static void miss(int[] a, int val) {
				int j=val;
				int m = 0;
		// System.out.println(j);
		
		for (int i=1;i<j;i++)
		{
			int B= a[i];
			m=i;
			//System.out.println(B);
			while(m>0 && B<a[m-1])
			{
				a[m]= a[m-1];
				
			//System.out.println("Value:-"+a[m]);
			m--;
			}
			
			
			a[m]=B;			
						
		}
			
			
		}
		
	}


