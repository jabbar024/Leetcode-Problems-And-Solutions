class Solution {
    public boolean isPalindrome(String s) 
    {
        s = s.toLowerCase();
        
        int start = 0, end = s.length()-1;

        while(start<end)
        {
            char ch1= s.charAt(start);
            char ch2 = s.charAt(end);

            if( ( (ch1>='a' && ch1<='z') || (ch1>='0' && ch1<='9') ) && ( (ch2>='a' && ch2<='z') || ((ch2>='0' && ch2<='9')) ) )
            {
                if(ch1 != ch2)
                {
                    return false;
                }
                start++; end--;
            }
            else if( !( (ch1>='a' && ch1<='z') || (ch1>='0' && ch1<='9') ) )
            {
                start++;
            }
            else if( !( (ch2>='a' && ch2<='z') || (ch2>='0' && ch2<='9') ) )
            {
                end--;
            }
        }

        return true;
    }
}