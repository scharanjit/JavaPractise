/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//http://whocouldthat.be/visualizing-string-matching/
package algoRithms;

/**
 *
 * @author charanjit.singh
 */
public class knuthMorrisPratt {
//largest preffix and suffix skip value table                                      
    public static void preProcessPattern(char[] ptrn, int ptrnLen, int[] lps) {
        int len = 0;
        int i;
        lps[0] = 0; //lps is array containing fail values
        i = 1;
        int M = ptrnLen;
        while (i < M) {
            if (ptrn[i] == ptrn[len]) { //suppose i=1 and len =0..i.e AA so 1st =1
                len++;
                lps[i] = len;
                i++;
            } else {// (pat[i] != pat[len])     //dont match AB       
                if (len != 0) {
                    // This is tricky. Consider the example 
                    // AAACAAAA and i = 7.
                    len = lps[len - 1];
                    // Also, note that we do not increment i here
                } else // if (len == 0)
                {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        System.out.println(" lps[k]" + "  k");
        for (int k = 0; k < lps.length - 1; k++) {

            System.out.println(" " + lps[k] + "       " + k);

        }
        System.out.println("");
    }
    public static void searchSubString(char[] ptrn, char[] text) {
        int i = 0, j = 0;
        // pattern and text lengths
        int ptrnLen = ptrn.length;
        int txtLen = text.length;
        int[] lps = new int[ptrn.length];
        // initialize new array and preprocess the pattern to find the skip table value
        preProcessPattern(ptrn, ptrnLen, lps);
        while (i < txtLen) {
            if (ptrn[j] == text[i]) {
                j++;
                i++;
            }
            if (j == ptrnLen) {
                System.out.println("Found pattern at index " + (i - j));
                j = lps[j - 1];
            } else if (i < txtLen && ptrn[j] != text[i]) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i = i + 1;
                }
            }
        }
    }
    public static void main(String[] args) {
        String text = "ABC ABCDAB ABCDABCDABDEAABAC";
        String pattern = "AABAC";
        char text1[];
        text1 = text.toCharArray();
        char ptrn[];
        ptrn = pattern.toCharArray();
        searchSubString(ptrn, text1);

    }

}
