package OCJP;

import java.io.FileNotFoundException;

public class ExceptionOverridetest {

		public static void main(String[] args) throws Exception {
			ExceptionOverrideParent P = new ExceptionOverrideParent();
			ExceptionOverrideParent C = new ExceptionOverrideChild();
			
			P.beta();
			C.beta();
			
		}
}
