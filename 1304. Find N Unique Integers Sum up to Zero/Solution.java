class Solution {
    public int[] sumZero(int n) {
        int[] arr=new int[n];
        int j=0;
        if(n>1)
        {
            j=1;
        }
        for(int i=0;i<n/2;i++)
        {
            arr[i]=j;
            arr[n-i-1]=-j;
            j++;
        }
        return arr;
    }
}