package OCJPChap3;
//TWO CONCEPTS ....BOXING & WIDENING of cast
// int to Integer
//short --> int
// int --> Long // THI IS ILLEGAL ...bot widening & boxing happening
//int --> long is legal
// int --> short  illegal

class Animal {

    static void eat() {

    }
}

public class Dog3 extends Animal {

    public static void main(String[] args) {
        Dog3 d = new Dog3();
        d.go(d); // is this legal ?
        int a = 5;
        //d.test(a);  // Why we cant widen int

        byte b = 5;

        go33(b); // can this byte turn into an Object ?

    }

    static void go33(Object o) //here is the exceptional case //boxing occurs with Object //Object is top hir class...so no probs
    {
        Byte b2 = (Byte) o; 					// ok - it's a Byte object
        System.out.println(b2);
    }

    void go(Animal a) //	reference widening
    {
    }

    void test(Long x) {
    }					//here in argument we have wraper class...not primitive type:- OPEN EYE
    // change void test(Long x) { }	 with void test(long x) { }	
    //actually we cant ask compiler for widening & boxing at a time
    // boxing primitive into wrapper
    //widenning means lower primitive into hight   int--> double
}
