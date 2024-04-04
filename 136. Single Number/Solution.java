class Solution {
    public int singleNumber(int[] nums) {
        int len=nums.length;
        if(len==1){
            return nums[0];
        }
        Arrays.sort(nums);
        if(nums[0]!=nums[1]){
            return nums[0];
        }
        for(int i=1;i<len-1;i++){
            if(nums[i-1]!=nums[i] && nums[i]!=nums[i+1]){
                return nums[i];
            }
        }
        return nums[len-1];
    }
}