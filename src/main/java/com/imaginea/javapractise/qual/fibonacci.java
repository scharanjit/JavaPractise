package qual;

public class fibonacci {

    public static void main(String[] args) {
        int startIndex = 2;
        int endIndex = 5;
        int search = 8;

        fibo(startIndex, endIndex, search);
    }

    private static void fibo(int startIndex, int endIndex, int search) {

        int fib[] = new int[endIndex];
        int flag = 0;
        int index = 0;
        int value = search;
        fib[0] = startIndex;
        fib[1] = startIndex + 1;
        for (int i = startIndex; i < endIndex; i++) {

            fib[i] = fib[i - 1] + fib[i - 2];

            if (fib[i] == search) {
                flag = 1;
                index = i;
                value = fib[i];
            }

        }

        for (int i = 0; i < endIndex; i++) {
            System.out.print(fib[i] + " ");
        }
        System.out.println();
        if (flag == 1) {
            System.out.println(1 + index + " is the index of value " + value);
        } else {
            System.out.println(value + " is NOT FOUND");
        }
    }

}
