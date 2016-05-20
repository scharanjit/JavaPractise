
public class missingvalueInArray {
	public static void main(String[] args) {
		int []a={6,4,8,7,5,3,2,1,10};
		System.out.println("Unsorted array");
		for(int k=0;k<a.length;k++)
		{
			
		System.out.print(" "+a[k]);
		}
		System.out.println(" ");
		sort(a,a.length);
		System.out.println("Sorted array---------------------->");
		for(int k=0;k<a.length;k++)
		{
			
		System.out.print(" "+a[k]);
		}
		System.out.println(" ");
		System.out.println("Duplicate value");
		
		dublicate(a,a.length);
		
		
		System.out.println(" ");
		System.out.println("Missing Value");
		missing(a,a.length);
		
		
		}

	//1st method using gauss formula
	//the array shud not contain duplicate vale
	public static void missing(int[] a, int length) {
		int N=length+1;
		int sum=0;
		for (int k=0;k<length;k++)
		{
			sum=sum+a[k];
		}
		
		
		
		
		int total= ((N+1)* N)/2;
		
		System.out.println("The Missing value is: "+(total-sum) );
		
		
		
	}
	
	//2nd method using XOR gate
	//B gives the total number of element we want..2 element are 
	
	/*public static void missing(int[] a, int C){
		int B=C+1;
		
	    int x=0;
	    for(int i=0; i<a.length;i++){
	        x=x^a[i];
	    }
	    for(int i=1;i<=B;i++){
	        x=x^i;
	    }
	    x = x &(~(x-1));
	    System.out.println(x);
	    int p=0, q=0;
	    for(int i=0;i<a.length;i++){
	        if((a[i] & x) == x){
	            p=p^a[i];
	        }
	        else{
	            q=q^a[i];
	        }   
	    }
	    for(int i=1;i<=B;i++){
	        if((i & x) == x){
	            p=p^i;
	        }
	        else{
	            q=q^i;
	        }
	    }

	    System.out.println("p(mISSING vALUE): "+p+" : "+q);
	}
*/
	private static void dublicate(int[] a, int length) {
		
		for(int m=0;m<length-1;m++)
		{
			if(a[m]==a[m+1])
			{
				System.out.println("The duplicate value is:"+a[m]);
				System.out.println("Index of duplicate value:"+m);
				//System.exit(0);
			}
		}
		
	}

	public static void sort(int[] a, int length) {
		
		
		
		int i=0;
		
		
		for(i=1;i<length;i++)
		{
			int j=i;
		int B= a[i];
		
		while(j>0 && a[j-1]> B)
		{
			a[j]=a[j-1];
			j--;
		}
		
		a[j]=B;
			
		}
		
	}

}
