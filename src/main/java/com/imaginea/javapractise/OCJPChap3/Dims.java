package OCJPChap3;

public class Dims {

	public static void main(String[] args)
	{
		int[][] a = {{1,2}, {3,4}};
		System.out.println(a[1][0]);
		int[] b = (int[]) a[1]; ///int[] is done to confuse the candidate

		//System.out.println(a[1][0]);
		Object o1 = a;
		int[][] a2 = (int[][]) o1;
		//int[] b2 = (int[]) o1;
		System.out.println(b[1]);
		System.out.println(b[0]);
	}
}