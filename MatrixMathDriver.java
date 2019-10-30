import java.util.Arrays;
/**
 * Write a description of class MatrixMathDriver here.
 *
 * @author (Mr. Kim)
 * @version (October 28. 2019)
 */
public class MatrixMathDriver
{
    public static void main(String[] args)
    {
        int[][] A=  { {1,2,3},{2,1,0},{1,0,2}};
        int[][] B = { {1,2,3,4,5}, {2,4,6,8,10}, {1,3,5,7,9}};
        int[][] C = { {-1,-2,-3},{-2,-3,-4},{4,3,5},{2,0,-1},{5,1,3} };
        
        MatrixMath mathA = new MatrixMath(A);
		
		/* TODO
		 * Use Arrays.toString on the results below
		 */
	mathA.rowSum();
	System.out.println("A rowSum is " + Arrays.toString(mathA.rowSum()));
	mathA.colSum();
        System.out.println("A colSum is " + Arrays.toString(mathA.colSum()));
        mathA.rowAve();
        System.out.println("A rowAve is " + Arrays.toString(mathA.rowAve()));
        mathA.colAve();
        System.out.println("A colAve is " + Arrays.toString(mathA.colAve()));
        
        MatrixMath mathB = new MatrixMath(B);
        
        mathA.rowSum();
	System.out.println("B rowSum is " + Arrays.toString(mathB.rowSum()));
	mathA.colSum();
        System.out.println("B colSum is " + Arrays.toString(mathB.colSum()));
        mathA.rowAve();
        System.out.println("B rowAve is " + Arrays.toString(mathB.rowAve()));
        mathA.colAve();
        System.out.println("B colAve is " + Arrays.toString(mathB.colAve()));
        
        MatrixMath mathC = new MatrixMath(C);
        
        mathA.rowSum();
	System.out.println("C rowSum is " + Arrays.toString(mathC.rowSum()));
	mathA.colSum();
        System.out.println("C colSum is " + Arrays.toString(mathC.colSum()));
        mathA.rowAve();
        System.out.println("C rowAve is " + Arrays.toString(mathC.rowAve()));
        mathA.colAve();
        System.out.println("C colAve is " + Arrays.toString(mathC.colAve()));
        
        
        
    }
}
