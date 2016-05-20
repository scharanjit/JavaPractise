package pRACTISE;

public class quickSort1 {

	public static int arr[]={1,5,2,3,7,8,0,-8};

	public static void main(String[] args) {
		int high=arr.length-1;
				
				

		quickAlgoo(0,high);
		
		
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}

		private static void quickAlgoo(int i1, int hif) {
			
			int i=i1;
			int j=hif;
			
			int pivot=arr[i+((hif-i)/2)];
			
			
			
			while(i<=j)
			{
				while(arr[i]<pivot)
				{
					i++;
				}
				while(arr[j]>pivot)
				{
					j--;
				}
				
				
				if(i<=j)
				{
					
					exchange(i,j);
					
					i++;
					j--;
					
				}
			}
			
			
			if(j>i1)
			{
				quickAlgoo(i1, j);
			}
			
			if(i<hif)
			{
				quickAlgoo(i, hif);
				
			}

		}

		private static void exchange(int i, int j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
		}	
		


}

