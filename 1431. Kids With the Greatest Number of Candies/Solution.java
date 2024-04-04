class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       List<Boolean> ans = new ArrayList<>();
        for(int i=0;i<candies.length;i++)
        {
            int sum=candies[i]+extraCandies;
            ans.add(greater(sum,candies));
        }
        return ans;
    }
    public boolean greater(int num1,int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        { 
            if(arr[i]>num1)
            {
                return false;
            }
        }
        return true;
    }
}