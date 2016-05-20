package OCJP;

public class returnTypes {

    //char is compatible with int
    public int Val() {
        char c = 'd';
        return c;
    }

    //primitive method return type , u can return any value that can be explicitly cast to the declared return type
    public int foo() {
        float f = 34.8f;
        return (int) f;
    }

    //
    public void jhill() {
        // return "this is not legal";
    }

    public static void main(String[] args) {
        char c = 'c';
        int i = c;
        System.out.println(i);

        float f = 1.3f;
        int i1 = (int) f;

        System.out.println(i1);

    }
}
