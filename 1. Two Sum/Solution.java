class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
     int sum=0,i=0,j=0;
     int[] arr=new int[2];
     for(i=1;i<nums.length;i++)
     {
        for(j=i;j<nums.length;j++)
        {
            sum=nums[i-1]+nums[j];
            if(sum==target)
            {
                arr[0]=i-1;
                arr[1]=j;
                return arr;
            }
        }
     }
     return arr;
    }
}