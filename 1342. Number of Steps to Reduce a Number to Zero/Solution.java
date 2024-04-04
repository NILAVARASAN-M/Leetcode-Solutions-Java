class Solution {
    public int numberOfSteps(int num) {
      int n=0;
      while(num!=0)
      {
        if(num%2==0)
        {
            n++;
            num=num/2;
        }
        else
        {
            n++;
            num=num-1;
        }
      }
      return n;
    }
}