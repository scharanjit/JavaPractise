package OCJPChap7;

public class _2BobTest 
{
	public static void main (String[] args) 
	{
		Bob f = new Bob("GoBobGo", 19);
		System.out.println(f);
	}
}

class Bob 
{
	int shoeSize;
	String nickName;
	Bob(String nickName, int shoeSize) 
	{
		this.shoeSize = shoeSize;
		this.nickName = nickName;
	}
	
	//overriding toString method
	public String toString()
	{
		return ("I am a Bob, but you can" +
				" call me " + nickName +". " +
				"My shoe size is " + shoeSize);
	}
}