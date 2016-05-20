package OCJP;

//multiple inheritance

public class InherD extends InherC {

	public int Dmethod()
	{
		return 10;
	}
	public static void main(String[] args) {
		InherD iD = new InherD();
		
		System.out.println(iD.abc()+"      "+iD.Dmethod());
	}
}
