package j2ee1001;

public class Practicek {
	public static void main(String args[]){
	int a=10;
	int b=5;
	try{
		a=a++;
		b-=5;
	if(a/b > 1)
		System.out.print(a);}
	catch(ArithmeticException ad){
		System.out.print("A");}
	catch(Exception e){
		System.out.print("B");
		}
	finally{
		System.out.print("C");}	}
}
