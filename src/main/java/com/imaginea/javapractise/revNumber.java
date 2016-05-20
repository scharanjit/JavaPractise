
public class revNumber {

		public static void main(String[] args) {
			int num=123456789;
			System.out.println(reverse(num));
		}

		private static int reverse(int num) {

			int rev=0;
			while(num!=0)
			{
				rev=(rev*10)+num%10;
				num = num/10;
			}
			
			return rev;
		}
}
