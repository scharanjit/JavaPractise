package OCJPChap7;
import java.util.*;
public class ZZZ_12TreeSubset {
		public static void main(String[] args) {
			TreeSet<String> s = new TreeSet<String>();
			 TreeSet<String> subs = new TreeSet<String>();
			 s.add("a");
			 s.add("b"); 
			 s.add("c");
			 s.add("d");
			 s.add("e");
			System.out.println(s);
			//subSet(s, b*, e, b*)
			//Returns a subset starting at element s and ending just before element e
			 subs = (TreeSet)s.subSet("b", true, "d", true);
			 System.out.println(subs);
			 s.add("g");
			 System.out.println("after adding g:- "+s);
			 s.pollFirst();
			 System.out.println("pollfirst s :       "+s);
			 s.pollFirst();
			 System.out.println("pollfirst second s :"+s);
			 s.add("c2");
			 System.out.println(s);
			 System.out.println(subs);
			 System.out.println(s.size() +" "+ subs.size());
		}

}
