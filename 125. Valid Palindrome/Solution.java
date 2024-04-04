class Solution {
    public boolean isPalindrome(String s) {
        String a="";
        for(int i=0;i<s.trim().length();i++)
        {
            char letter=s.trim().charAt(i);
            if((int)letter>=97 && (int)letter<=122)
            {
                a+=letter;
            }
            else if((int)letter>=65 && (int)letter<=90)
            {
                
                char c=(char)((int)letter+32);
                a+=c;
            }
            else if((int)letter>=48 && (int)letter<=57)
            {
                 a+=letter;
            }
        }
        return booleanchecker(a);
    }
    public boolean booleanchecker(String a)
    {
        String b="";
        for(int i=0;i<a.trim().length();i++)
        {
            char c=a.trim().charAt(a.length()-1-i);
            b+=c;
        }
        if(b.equals(a))
        {
            return true;
        }
        return false;
    }
}