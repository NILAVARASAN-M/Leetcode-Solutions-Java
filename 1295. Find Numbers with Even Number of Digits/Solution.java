class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            count=count+digits(nums[i]);
        }
        return count;
    }
    public int digits(int number)
    {
        int sum=0,x=number;
        if(number>0)
        {
        while(x>0)
        {
            sum++;
            x=x/10;
        }
        }
        else if(number<0)
        {
            while(x<0)
        {
            sum++;
            x=x/10;
        }
        }
        if(sum%2==0)
        {
            return 1;
        }
        return 0;
    }
}