public class decimaltoBinary {

	public static void main(String[] args) {
		int dec=5;
		decimalToBinary(dec);
	}

	private static void decimalToBinary(int dec) {
		int  binary[] = new int[25];
		int index=0;
		while(dec!=0)
		{
			
			binary[index++]=dec%2;
			dec=dec/2;
		}

		for(int i=index-1;i>=0;i--)
		{
			System.out.println(binary[i]);
		}
	}
}
