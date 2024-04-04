class Solution {
    public int tribonacci(int n) {
        int a=0,b=0,c=0,d=1;
        for(int i=0;i<n;i++)
        {
            a=b+c+d;
            d=c;
            c=b;
            b=a;
        }
        return a;
    }
}