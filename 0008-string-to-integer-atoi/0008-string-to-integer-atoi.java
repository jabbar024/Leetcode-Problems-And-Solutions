import java.math.BigInteger;
class Solution {
    public int myAtoi(String s) 
    {
        int min = Integer.MIN_VALUE, max = Integer.MAX_VALUE;
        s = s.trim();

        if(s.isEmpty())
        {
            return 0;
        }

        int i=0, length = s.length();
        boolean negative = false;

        if(s.charAt(i)=='-')
        {
            i++;
            negative = true;
        }
        else if(s.charAt(i)=='+')
        {
            i++;
        }
        
        long ans = 0;

        while( i<length && Character.isDigit(s.charAt(i)))
        {
            ans = (ans*10)+(s.charAt(i)-'0');

            if(negative && -ans<=min)
            {
                return min;
            }
            else if(!negative && ans>=max)
            {
                return max;
            }
            i++;
        }

        return negative ? (int)(-ans) : (int)(ans);
    }
}