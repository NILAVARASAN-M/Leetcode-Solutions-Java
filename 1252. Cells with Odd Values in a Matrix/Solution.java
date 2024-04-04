class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] arr=new int[m][n];
        for(int i=0;i<indices.length;i++)
        {
           arr=incrementer(arr,indices[i]);
        }
        return oddnos(arr);
    }
    public int[][] incrementer(int[][] arr,int[] indices)
    {
        for(int i=0;i<arr[0].length;i++)
        {
            arr[indices[0]][i]=arr[indices[0]][i]+1;
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i][indices[1]]= arr[i][indices[1]]+1;
        }
        return arr;
    }
    public int oddnos(int[][] arr)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]%2!=0)
                {
                    count++;
                }
            }
        }
        return count;
    }
}












