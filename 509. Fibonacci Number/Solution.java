class Solution {
    public int fib(int n) {
        int a=0,b=0,c=1;
        while(n>0)
        {
            a=b+c;
            c=b;
            b=a;
            n--;
        }
        return a;
    }
}