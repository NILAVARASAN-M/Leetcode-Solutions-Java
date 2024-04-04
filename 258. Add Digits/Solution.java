class Solution {
    public int addDigits(int num) {
        while(num>0)
        {
            int sum=0;
            while(num>0)
            {
                int rem=num%10;
                sum=sum+rem;
                num=num/10;
            }
            if(count(sum)==1)
            {
                return sum;
            }
            num=sum;
        }
        return 0;
    }
    public int count(int num)
    {
        int n=0;
        while(num>0)
        {
            n++;
            num=num/10;
        }
        return n;
    }
}