class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length,n=matrix[0].length;
        int[][] copy=new int[m][n];
        copy=matcopy(matrix,copy);
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
            if(copy[i][j]==0)
            {
                matrix=zeroputter(matrix,i,j);
            }
            }
        }
    }
    public int[][] zeroputter(int[][] matrix,int m,int n) //m has row number 
    {
        for(int i=0;i<matrix.length;i++)
        {
            matrix[i][n]=0;
        }
        for(int i=0;i<matrix[0].length;i++)
        {
            matrix[m][i]=0;
        }
        return matrix;
    }
    public int[][] matcopy(int[][] matrix,int[][] copy)
    {
        for(int i=0;i<matrix.length;i++)
    {
            for(int j=0;j<matrix[0].length;j++)
        {
            copy[i][j]=matrix[i][j];
        }
    }
    return copy;
    }
}