class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
       return invert(flipper(image));
    }
    public int[][] flipper(int[][] image)
    {
        int m=image.length,n=image[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n/2;j++)
            {
               int temp=image[i][j];
               image[i][j]=image[i][n-j-1];
                image[i][n-j-1]=temp;
            }
        }
        return image;
    }
    public int[][] invert(int[][] image)
    {
        int m=image.length,n=image[0].length;
         for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               if(image[i][j]==1)
               {
                   image[i][j]=0;
               }
               else
               {
                   image[i][j]=1;
               }
            }
        }
        return image;
    }
}





