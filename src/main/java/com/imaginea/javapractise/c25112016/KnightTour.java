/*
 The knight’s tour puzzle is played on a chess board with a single chess piece,
the knight. The object of the puzzle is to find a sequence of moves that allow
the knight to visit every square on the board exactly once. One such sequence
is called a “tour.” The knight’s tour puzzle has fascinated chess players,
mathematicians and computer scientists alike for many years. The upper bound 
on the number of possible legal tours for an eight-by-eight chessboard is known 
to be 1.305×10351.305×1035; however, there are even more possible dead ends.
Clearly this is a problem that requires some real brains, some real computing
power, or both.
 */

package c25112016;

/**
 *
 * @author Charanjit.Singh
 */
public class KnightTour
{
    private static final int N = 8;
    private int soln[][];
 
    public KnightTour()
    {
        soln = new int[N][N];
    }
 
    private boolean isSafe(int x, int y)
    {
        if (x >= 0 && x < N && y >= 0 && y < N && soln[x][y] == -1)
            return true;
        return false;
    }
 
    private void printSolution()
    {
        for (int x = 0; x < N; x++)
        {
            for (int y = 0; y < N; y++)
            {
                System.out.print("  " + soln[x][y]);
            }
            System.out.println();
        }
    }
 
    private boolean solveKTUtil(int x, int y, int movei, int xMove[],int yMove[])
    {
        int k, nextX, nextY;
        if (movei == N * N)
            return true;
 
        for (k = 0; k < N; k++)
        {
            nextX = x + xMove[k];
            nextY = y + yMove[k];
            if (isSafe(nextX, nextY))
            {
                soln[nextX][nextY] = movei;
                if (solveKTUtil(nextX, nextY, movei + 1, xMove, yMove))
                    return true;
                else
                    soln[nextX][nextY] = -1;
            }
        }
        return false;
    }
 
    public boolean solveKnightTour()
    {
        for (int x = 0; x < N; x++)
        {
            for (int y = 0; y < N; y++)
            {
                soln[x][y] = -1;
            }
        }
        int xMove[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
        int yMove[] = { 1, 2, 2, 1, -1, -2, -2, -1 };
        soln[0][0] = 0;
        if (!solveKTUtil(0, 0, 1, xMove, yMove))
        {
            System.out.println("the solution does not exist");
            return false;
        }
        else
        {
            printSolution();
        }
        return true;
    }
 
    public static void main(String... arg)
    {
        KnightTour knightTour = new KnightTour();
        System.out.println("the solution is");
        knightTour.solveKnightTour();
    }
}
