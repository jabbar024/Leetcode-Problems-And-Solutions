class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        int maxLength = 0 ;
        if(s.length()==1)
        {
            return 1 ;
        }
        for(int i=0; i<s.length(); i++)
        {
            String tempStr = String.valueOf(s.charAt(i));
            for(int j=i+1; j<s.length(); j++)
            {
                if( ! tempStr.contains(String.valueOf(s.charAt(j))) )
                {
                    tempStr += s.charAt(j) ;
                }
                else
                {
                    break ;
                }
               
            }
            maxLength = Math.max(tempStr.length(), maxLength) ;
        }  

        return maxLength ;      
    }

    public static boolean charContain(String str, String c)
    {
        return str.contains(c);

    }
}