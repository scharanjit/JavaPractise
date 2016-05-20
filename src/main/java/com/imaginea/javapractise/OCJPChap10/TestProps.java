package OCJPChap10;

import java.util.*;
public class TestProps 
{
	public static void main(String[] args)
	{
		Properties p = System.getProperties();
		p.setProperty("myProp", "myValue");
		p.list(System.out);
	}
}