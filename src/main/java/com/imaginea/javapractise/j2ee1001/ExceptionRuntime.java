package j2ee1001;

import java.util.LinkedList;
import java.util.List;

public class ExceptionRuntime { 
	public String b(Integer x) {
		List <String> ys = new LinkedList<String>();
		List xs = ys;
		//xs =add(x);  //Class cast exception(coz v r sendin integer n convertin it to string)
		return ys.iterator().next();
	}
	
	public static void main(String args[]) {
		ExceptionRuntime a = new ExceptionRuntime();
		System.out.println(a.b(new Integer(900)));
	}
}
