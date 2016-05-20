package HiHa;

public class possiblematchinarray {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int val=1;
		
		int ind = 0;
		for(int m=arr.length-1;m>=0;m--)
		{
			if(val==arr[m])
			{
				 ind=m;
			}
		}
	   
	
	
	
		for(int i=arr.length-1;i>=0;i--)
			
		{
			if(ind !=i)
			System.out.println("possible matches : "+arr[ind]+arr[i]);
		}
	}

	
		
	}


