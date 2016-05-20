package OCJPChap3;

public class JavaCallByRefNotValue 
{
	static int b =5; // b is 
	public static void main(String[] args)
	{
		int a = 1;  //a is primitive
		JavaCallByRefNotValue rt = new JavaCallByRefNotValue();
		System.out.println("Before modify() a = " + a);
		rt.modify(a);
		System.out.println("After modify() a = " + a);  //reference 'a' is calling  

	}
	void modify(int number)
	{
		number = number + 1;
		System.out.println("number = " + number);
	}

}
