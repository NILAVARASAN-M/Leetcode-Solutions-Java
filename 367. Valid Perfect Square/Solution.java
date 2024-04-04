class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1)
        {
            return true;
        }
        for(int i=1;i<num;i++)
        {
            int product=i*i;
            if(product==num)
            {
                return true;
            }
        }
        return false;
    }
}