class Solution {
    public String toLowerCase(String s) {
        String a="";
        for(int i=0;i<s.length();i++)
        {
            char b=s.trim().charAt(i);
            if(b>='A' && b<='Z')
            {
                a+=(char)((int)b+32);
            }
            else
            {
                a+=b;
            }
        }
        return a;
    }
}