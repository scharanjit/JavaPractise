//package newProblems;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Map;
//import java.util.Map.Entry;
//import java.util.Set;
//
//public class sortArray {
//
//	public static void main(String[] args) {
//				  //1,2,3,4,5,6,7,8
//		int arra[]={8,3,6,1,2,7,4,9};
//		          //8,3,6,5,7,4,9,2
//
//
//		//odd in descending
//
//		//even in ascending
//
//
//		sortMeth12(arra,0);
//
//		//Arrays.sort(arra);
//		//sortMeth1(arra,0);
//
//
//		for(int i=0;i<arra.length;i++)
//		{
//			if(arra[i]<0)
//			{
//				//arra[i]=(-1)*arra[i];
//
//			}
//			System.out.print(arra[i]+" ");
//		}
//	}
//
//
//	private static int[] sortMeth(int[] arra) {
//
//		for(int i=arra.length-1;i>=0;i--)
//		{
//			if( i%2!=0 ){//odd is descending
//
//
//				arra[i]=-1*arra[i];
//
//			}
//
//
//
//		}
//		return arra;
//
//	}
//
//	private static int[] sortMeth12(int[] arra,int k) {
//		HashMap h1 = new HashMap();
//		HashMap h2 = new HashMap();
//		for(int i=0;i<arra.length-1;i++)
//		{
//			
//			
//			if(i%2==0)
//			{
//				
//				h1.put(i, arra[i]);
//				
//				Set s = new HashSet(h1.entrySet());
//				
//				List l = new ArrayList();
//				//Collections.sort(l,new Comparator<Map.Entry<Integer,Integer>>(){
//					
//					
//					
//				});
//				
//				
//
//			}
//			else
//			{
//				h2.put(i, arra[i]);
//			
//			}
//		
//		
//		}
//		
//		return arra;
//		
//		
//		
//	}
//	
//	
//	
//	
//}