
/**
 * Write a description of class MatrixMath here.
 *
 * @author ( Mr. Kim)
 * @version ((October 28. 1029)
 */
public class MatrixMath
{
    // instance variables - replace the example below with your own
    private int[][] data;

    /**
     * Constructor for objects of class MatrixMath
     */
    public MatrixMath(int[][] data)
    {
        // initialise instance variables
       this.data = data;
    }

    /**
     * Find the sum of all the elements in each row.
     * 
     *
     * @return    int[]
     */
    public int[] rowSum()
    {
        int[]sumRow = new int[data.length];
        for (int i=0; i<data.length; i++)
        {
                int sum = 0;
                for ( int j=0; j<data[i].length; j++)
                {
                   sum+=data[i][j];
                }
                sumRow[i]=sum;
        }
        return sumRow;
    }
    
        /**
     * Find the average of all the values in each row
     *
     * @return    int[] 
     */
    public double[] rowAve()
    {
        double[] aveRow = new double [data.length];
        int[] rowSums = rowSum();
        
        for (int i=0; i<data.length;i++)
        {
            aveRow[i]=(double)rowSums[i]/data[i].length;
        }
        return aveRow;
    }
    
        /**
     * Find the sum of all the numbers in column
     * 
     *
     * @return    int[] 
     */
    public int[] colSum()
    {
        int[] colRow = new int[data.length];
        for (int j=0; j<data.length; j++)
        {
                int sum = 0;
                for ( int i=0; j<data[j].length; i++)
                {
                   sum+=data[j][i];
                }
                colRow[j]=sum;
        }
        return colRow;
    }
    
     /**
     * Find the average of all the values in each row
     *
     * @return    int[] 
     */
    public double[] colAve()
    {
        double[] colRow = new double [data.length];
        int[] colSums = colSum();
        
        for (int i=0; i<data.length;i++)
        {
            colRow[i]=(double)colSums[i]/data[i].length;
        }
        return colRow;
    }
    
}
