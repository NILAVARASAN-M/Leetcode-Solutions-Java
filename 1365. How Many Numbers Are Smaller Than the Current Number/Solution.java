class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=smallnos(nums,i);
        }
        return ans;
    }
    public int smallnos(int[] arr,int n)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<arr[n])
            {
                count++;
            }
        }
        return count;
    }
}