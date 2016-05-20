package hihi;

//Given a linked list like a1-a2-a3-a4-b1-b2-b3-b4. Convert it into a1-b1-a2-b2-a3-b3-a4-b4.

public class swap {
	public static int[] interleave(int arr[], int len) {
		  int n = len/2;
		  for (int i = 1; i < n; i++) { 
		    for (int j = 0; j < i; j++) { 
		     // swap(arr, n-i+2*j, n-i+2*j+1);
		      int temp=arr[n-i+2*j+1];
		      arr[n-i+2*j+1]=arr[n-i+2*j];
		      arr[n-i+2*j]=temp;
		    }
		  }
		return arr;
		}

	public static void main(String[] args) {
		
		int arr[]={1,2,3,4,1,2,3,4};
		 
		interleave(arr,arr.length);
		
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(" "+arr[i]);
				
			}
	
	}
}
