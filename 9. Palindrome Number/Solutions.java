class Solution {
    public boolean isPalindrome(int x) {
        int num=0 , check=x;
        while(check>0)
        {
            int rem=check%10;
            num=num*10+rem;
            check=check/10;
        }
        if(num==x)
        {
            return true;
        }
        return false;
    }
}