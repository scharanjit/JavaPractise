
public class MyArrayList {

		public static void main(String[] args) {
			MyArrayList v=new MyArrayList();
			v.add(new Integer(4));
			
			System.out.println(v.get(1));
		}
		
		private Object get(int i) {
			return var[i];
			
		}

		private Object[] var;
		int actSize=0;
		
		public MyArrayList()
		{
			var= new Object[10];
		}
		private void add(Object value) {
			var[++actSize]=value;
			
		}

		
}
