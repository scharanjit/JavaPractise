package hihi;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;
 
public class exampLst {

	public static void main(String[] args) {
	 ArrayList<String> list = new ArrayList<String>();
	 
	 list.add("Hi");
	 list.add("...");
	 list.add("My name is");
	 
	 java.util.Iterator<String> it =list.iterator();
	 
	 while(it.hasNext())
	 {
		 System.out.println(it.next());
	 }
	 
	}

}
