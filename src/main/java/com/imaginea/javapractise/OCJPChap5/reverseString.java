package OCJPChap5;

public class reverseString {

	public static void main(String[] args) {
		String ample="Cat";

		reverseStringFucnction(ample);


	}

	public static String reverseStringFucnction(String ample) {


		String reverseStr = ample;
		try {
			if(reverseStr.length()==0)
			{
				throw new Exception();
			}
			else
			{
				
				//System.out.println(reverseStr.length());
				for(int i=reverseStr.length()-1;i>=0;i--) {
					reverseStr += reverseStr.charAt(i);
					//System.out.println(reverseStr);

				}
			}
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		System.out.println(reverseStr);

		return reverseStr;

	}

}
