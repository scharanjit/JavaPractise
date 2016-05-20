package OCJPChap4;


public class Spock {
	public static void main(String[] args) {
		int mask = 0;
		int count = 0;
		if( ((5<7) || (++count < 10)) | mask++ < 10 ) 
			//Prefix operators (++ and --) run before the value is used in the expression.
			//Postfix operators (++ and --) run after the value is used in the expression.
			mask = mask + 1;
		System.out.println("mask :--> "+mask);
		if( (6 > 8) ^ false) 
			mask = mask + 10;   //xor 1,0-->1   0,1--> 1    0,0 -->0    1,1--->0

		if( !(mask > 1) && ++count > 1) // it wnt chech other...bec and is 1 1 --> 1 rest all zero
			mask = mask + 100;
		System.out.println(mask + " " + count);

		if(false^false)
		{
			System.out.println("1ccccc");
		}
		else
		{
			System.out.println("2cccccccccccc");
		}

	}
}