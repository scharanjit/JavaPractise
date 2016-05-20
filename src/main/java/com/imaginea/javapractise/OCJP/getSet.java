package OCJP;
//DO NOT MAKE ANY CHANGE & FOLLOW CLASS USEGETSET>JAVA
public class getSet {
	private int left=3;		//use protectec or private
	private int right=9;	//use protected or private
	
	
	
	public int setLeft(int leftnum)
	{
		left=leftnum;
		right=left/3;
		return right;
				
	}

}
