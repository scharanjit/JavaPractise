/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivy.com.org.thread;

/**
 *
 * @author charanjit.singh
 */
public class ivyC {

    public static void main(String[] args) {
        // We have an original string here that we'll need to reverse.
        String words = " My name is CJ All INDIA ";
        char ch[] = words.toCharArray();
        char arr[] = new char[words.length()];
        int m = 0;
        int s=0;
        for (int i = ch.length-1; i >= 0; i--) {
            if (ch[i] == ' ' || i==0) {
                m = i;
                for (int j = m+1; j < ch.length; j++) {
                   
                    arr[s] = ch[j];
                     s=s+1;
                     if(ch[j]==' ') break;
                   
                    
                }
            }

        }

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]);
        }

    }
}
/*





 */
