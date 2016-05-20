package j2ee1001;
//Very Important
class abc{
	static int i;
	int k;
	void test(){   //concept is same
				//But look nothing is going inside...
			//nothing coming out
		System.out.println(i);
		System.out.println(k);
	}
	
	}
public class static_abc1 extends abc{
	public static void main(String []args){
		abc a = new abc();
		a.test();
		
		//System.out.println(k);
		System.out.println(i);
	}
}
