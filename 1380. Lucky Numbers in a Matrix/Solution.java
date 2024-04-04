class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list=new ArrayList<>();
         for(int i=0;i<matrix.length;i++)
         {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(lucky(matrix,i,j))
                {
                    list.add(matrix[i][j]);
                }
            }
         }
        return list;
    }
    public boolean lucky(int[][] matrix,int m,int n)
    {
        int num=matrix[m][n];
        for(int i=0;i<matrix.length;i++)
        {
            if(matrix[i][n]>num)
            {
                return false;
            }
        }
        for(int i=0;i<matrix[0].length;i++)
        {
            if(matrix[m][i]<num)
            {
                return false;
            }
        }
        return true;
    }
}