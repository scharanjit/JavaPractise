package OCJPChap4;

public class Comp2 {
	public static void main(String[] args) {
		float f1 = 2.3f;
		float[][] f2 = {{42.0f}, {1.7f, 2.3f}, {2.6f, 2.7f}};
		float[] f3 = {2.7f};
		Long x = 42L;
		// insert code here
			//if(f1 == f)			//f2 is a 2d array
			if(f1 == f2[2][1])
			if(x == f2[0][0])
			//if(f1 == f2[1,1])
			if(f3 == f2[2])
		System.out.println("true");
		//System.out.println("f2[0][0]  : "+f2[0][1]);
	}
}