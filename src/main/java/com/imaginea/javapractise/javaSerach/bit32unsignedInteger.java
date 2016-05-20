/*
 Implement a fast integer square root functiion that takes
 in a 32-bit unsigned 让lteger and returns another 32-bit unsigned integer
 that is the floor of the square root of the input.
 */
package javaSerach;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Charanjit.Singh
 */
public class bit32unsignedInteger {

    public static int sqr_search(int input) {
        int begin = 0;
        int end = 65536;
        while (begin + 1 < end) {
            int mid = begin + (end - begin) / 2;
            int mid_sqr = mid * mid;
            if (mid_sqr == input) {
                return mid;
            } else if (mid_sqr > input) {
                end = mid;
            } else {
                begin = mid;
            }
        }
        return begin;
    }

    public static int sortedArrayWithKey(int[] a, int k) {
        int len = a.length - 1;
        int key = k;
        int start = 0;

        while (start <= len) {
            int m = start + (len - 1) / 2;

            if (a[m] < k) {
                start = m + 1;
            } else if (a[m] == k) {
                return k;
            } else {
                len = m - 1;

            }
        }

        return -1;
    }

    public static int indexCapture(int a[]) {

        return -1;

    }

    public static void main(String[] args) {
        System.out.println(sqr_search(20));
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(sortedArrayWithKey(a, 5));

        Map m = new HashMap();

        m.put(1, "11");
        m.put(2, "11");
        m.put(3, "11");
        m.put(4, "11");
        m.put(4, "1134");
        m.put(6, "11");
        m.put(5, "11");
        m.put(9, "11");

        System.out.println(m);

        Set<String> s = new HashSet<String>();

        s.add("1");
        s.add("2");
        s.add("3");
        s.add("2");
        s.add("4");

        System.out.println(s);

    }
}
