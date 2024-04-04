class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
  
        Arrays.sort(nums);
        int max=0,count=1,num=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                count++;
            }
            else{
                count = 1;
            }
            if(count>max){
                num=nums[i];
                max = count;
            }
        }
        return num;
    }
}