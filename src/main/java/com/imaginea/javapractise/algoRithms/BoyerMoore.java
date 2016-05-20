/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package algoRithms;

/**
 *
 * @author Charanjit.Singh
 */
public class BoyerMoore {
    private final int R;     // the radix
    private int[] right;     // the bad-character skip array
    private char[] pattern;  // store the pattern as a character array
    private String pat;      // or as a string
    //SKIP TABLE
    public BoyerMoore(char[] pattern, int R) {
        this.R = R;
        this.pattern = new char[pattern.length];
        for (int j = 0; j < pattern.length; j++)
            this.pattern[j] = pattern[j];
        //make skip table
        // position of rightmost occurrence of c in the pattern
        right = new int[R];
        for (int c = 0; c < R; c++)
            right[c] = -1;
        for (int j = 0; j < pattern.length; j++)
            right[pattern[j]] = j;
    }
    /**
     * Returns the index of the first occurrrence of the pattern string
     * in the text string.
     *
     */
    public int search(char[] text) {
        int M = pattern.length;
        int N = text.length;
        int skip;
        for (int i = 0; i <= N - M; i += skip) {
            skip = 0;
            for (int j = M-1; j >= 0; j--) {
                if (pattern[j] != text[i+j]) {
                    skip = Math.max(1, j - right[text[i+j]]);//return which ever is larger between 1 & j - right[text[i+j]
                    break;
                }
            }
            if (skip == 0) return i;    // found
        }
        return N;                       // not found
    }

    public static void main(String[] args) {
        String pat = "NEEDLE";
        String txt = "MYNAMEISNEEDLEEHELO IDIOTSneedleNEIDLENIDLE";
        char[] pattern = pat.toCharArray();
        char[] text    = txt.toCharArray();
        BoyerMoore boyermoore2 = new BoyerMoore(pattern, 256);
        int offset2 = boyermoore2.search(text);
        System.out.println("text:    " + txt);
         System.out.print("pattern: ");
        for (int i = 0; i < offset2; i++)
            System.out.print(" ");
         System.out.println(pat);
    }
}