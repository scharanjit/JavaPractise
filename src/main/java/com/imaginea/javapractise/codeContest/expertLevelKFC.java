package codeContest;

import java.io.*;
import java.math.BigInteger;

public class expertLevelKFC {

    private static final int MOD = 1000000007;

    private static final BigInteger BI_MOD = BigInteger.valueOf(MOD);

    public static int min_boards(final int advertisingBoards, final int consecutiveBoards, final int minimumRequired) {
        if (1 <= minimumRequired
                && minimumRequired <= consecutiveBoards
                && consecutiveBoards <= 50
                && consecutiveBoards <= advertisingBoards
                && advertisingBoards <= Math.pow(10, 9)) {

            final int bad = advertisingBoards % consecutiveBoards;
            final int good = consecutiveBoards - bad;
            int answer;
            if (good >= minimumRequired) {
                answer = possibleSolutions(advertisingBoards / consecutiveBoards, good, minimumRequired);
            } else {
                answer = possibleSolutions(advertisingBoards / consecutiveBoards + 1, bad, minimumRequired - good);
            }

            return answer;
        } else {
            return -1;
        }
    }

    private static int possibleSolutions(final int i1, final int i2, final int i3) {
        final int a = i2 - i3;
        long result = 1;
        for (int i = 0; i < i3; i++) {
            result = (result * nextValue(a + i, a + i1 + i3 - 1)) % MOD;
            result = (result * (BigInteger.valueOf(nextValue(i, a + i1 + i3 - 1)).modInverse(BI_MOD).longValue())) % MOD;
        }

        return (int) result;
    }

    private static long nextValue(final int k, final int n) {
        long result = 1;
        for (int i = n - k + 1; i <= n; i++) {
            result = result * i % MOD;
        }

        for (int i = 1; i <= k; i++) {
            result = result * BigInteger.valueOf(i).modInverse(BI_MOD).longValue() % MOD;
        }
        return result;
    }

    public static void main(final String[] args) throws Exception {
     /*  System.out.println(CandidateCode.min_boards(4, 2, 3));
        System.out.println(CandidateCode.min_boards(3, 1, 1));
     
        System.out.println(CandidateCode.min_boards(4, 3, 2));
        System.out.println(CandidateCode.min_boards(4, 3, 1));
        System.out.println(CandidateCode.min_boards(2, 2, 1));
        System.out.println(CandidateCode.min_boards(4, 2, 1));
        System.out.println(CandidateCode.min_boards(3, 3, 2));
        System.out.println(CandidateCode.min_boards(3, 3, 1));
        System.out.println(CandidateCode.min_boards(4, 4, 3));
       
        System.out.println(CandidateCode.min_boards(100, 10, 5));
        System.out.println(CandidateCode.min_boards(100000, 20, 18));*/
        
        System.out.println(expertLevelKFC.min_boards(3, 2, 1));
        System.out.println(expertLevelKFC.min_boards(6, 3, 2));


       /* BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String[] arrInput = new String[t];
        for (int i = 0; i < t; i++) {
            arrInput[i] = br.readLine();
        }

        for (int i = 0; i < t; i++) {
            String[] input = arrInput[i].split(" ");
            System.out.println(CandidateCode.min_boards(Integer.parseInt(input[0]), Integer.parseInt(input[1]), Integer.parseInt(input[2])));
        }*/

    }
}