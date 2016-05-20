package HiHa;
//process of making classes immutable (Stringis immuatable i.e...we can make user defined variable immuatble)
//make class final
//declare all variable as private

public class UserMut
{

  
  public static void main(String[] args)
  {
     System.out.println("Hello World!...");

     OhNoMutable mutable = new OhNoMutable(1, 2);
     ImSoImmutable immutable = mutable;


    
     System.out.println(immutable.add());

     
     mutable.field3=4;

     
     System.out.println(immutable.add());

    
  }

}



