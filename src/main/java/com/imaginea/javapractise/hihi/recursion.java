package hihi;

import javax.naming.spi.DirStateFactory.Result;

public class recursion {
	
	
	public static void main(String[] args) {
		
		String arr[]={"a","b","c"};
		
		for(int i=1;i<=arr.length;i++)
		{
			String resul[]=  getAllList(arr,i);
			for( int l=0;l<resul.length;l++)
			{
				System.out.print(" "+resul[l]);
			}
		}		
	}

	private static String[] getAllList(String[] arr, int i) {
		
		String fArr[]= new String[(int) Math.pow(arr.length, i)];
		
		if(i==1)
		{
			return arr;
		}
		else
		{
			String rArr[]= getAllList(arr, i-1);
			
			int k=0;
			for(int im=0; im<arr.length;im++)
			{
				for(int j=0;j<rArr.length;j++)
				{
					fArr[k]=arr[im]+rArr[j];
					k++;
				}
				
			}
			return fArr;
		}
	}

	
}
