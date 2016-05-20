package HiHa;


public class Merge
	{
		private static void sort(Comparable[] a,Comparable[] aux, int l, int r)
		{
			if (r <= l + 1) return;
			int m = l + (r - l) / 2;
			sort(a, aux, l, m);
			sort(a, aux, m, r);
			merge(a, aux, l, m, r);
		}
		
		
		public static void main(String[] args) {
		char a[]={'A','5','6','7','6','4','7','6'};
			char aux[]={'1','2'};
		int	l=0;
			int r=7;
			//sort (a,aux,l,r);
					
			}
		


		public static void sort(Comparable[] a)
		{
			Comparable[] aux = new Comparable[a.length];
			sort(a, aux, 0, a.length);
		}


		private static void merge(Comparable[] a,Comparable[] aux, int l, int m, int r)
		{
			for (int k = l; k < r; k++) aux[k] = a[k];
			int i = l, j = m;
			for (int k = l; k < r; k++)
				if (i >= m) a[k] = aux[j++];
				else if (j >= r) a[k] = aux[i++];
				else if (less(aux[j], aux[i])) a[k] = aux[j++];
				else a[k] = aux[i++];
		}
		private static boolean less(Comparable comparable,Comparable comparable2) 
		{
			// TODO Auto-generated method stub
			return false;
		}
		
		
		
}

