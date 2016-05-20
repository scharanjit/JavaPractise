package pRACTISE;
// time comp:- nlogn     worst is n2
public class quickSort {
	
	public static int  aray[]={5,4,3,6,7,8,2,200,-1,0,5};
	public static void main(String[] args) {
		int len=aray.length-1;
		quickAlgo(0,len);

		for(int i:aray)
		{
			System.out.print(i+" ");
			
		}
	}
	private static void quickAlgo(int lower, int higher) {
		
		int i=lower;
		int j=higher;
		int pivot=aray[i+((higher-i)/2)];
		while(i<=j)
		{
			while(aray[i]<pivot)
			{
				i++;
			}
			
			while(aray[j]>pivot)
			{
				j--;
			}
			
			if(i<=j)
			{
				exchangeNumber(i,j);
				i++;
				j--;
			}
		}
			if(j>lower)
			{
				quickAlgo(lower, j);
			}
			if(i<higher)
			{
				quickAlgo(i, higher);
			}		
	}
	private static void exchangeNumber(int i, int j) {
		int temp=aray[i];
		aray[i]=aray[j];
		aray[j]=temp;
		
	}

}
