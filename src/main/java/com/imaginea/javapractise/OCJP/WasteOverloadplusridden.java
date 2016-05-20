package OCJP;
//polymorphism+overoad+overridden

class WasteOverloadplusriddenParent {

    public void eat() {
        System.out.println("Parent");
    }
}

public class WasteOverloadplusridden extends WasteOverloadplusriddenParent {

    public void eat() {
        System.out.println("child");
    }

    public void eat(String s) {
        System.out.println("Child " + s);
    }

    public static void main(String[] args) {

        WasteOverloadplusriddenParent P = new WasteOverloadplusriddenParent();
        P.eat();

        WasteOverloadplusridden C = new WasteOverloadplusridden();
        C.eat();

        WasteOverloadplusriddenParent P1 = new WasteOverloadplusridden();
        P1.eat();

        WasteOverloadplusriddenParent P2 = new WasteOverloadplusridden();
//        P2.eat("Stress");
        //compiler still looks at the reference
        //parent does not have method which can accept String

        WasteOverloadplusridden C1 = new WasteOverloadplusridden();
        C1.eat("Stress");

        WasteOverloadplusriddenParent P3 = new WasteOverloadplusriddenParent();
//        P3.eat("Sttress");
        //parent does not have methos which can accept String

    }
}
