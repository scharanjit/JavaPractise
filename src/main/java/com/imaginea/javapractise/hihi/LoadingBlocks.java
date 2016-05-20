package hihi;

//The static block is only loaded when the class object is created by the JVM for the 1st time whereas
//init {} block is loaded every time class object is created.
//Also first the static block is loaded then the init block.

public class LoadingBlocks {

static{
System.out.println("Inside static");
}

{
System.out.println("Inside init");
}
public static void main(String args[])

{
new LoadingBlocks();
new LoadingBlocks();
new LoadingBlocks();
}

}