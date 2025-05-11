class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        int maxLength = 0 ;
        int stringSize = s.length() ;

        if(stringSize==1)
        {
            return 1 ;
        }
        for(int i=0; i<stringSize; i++)
        {
            StringBuilder tempStr = new StringBuilder(String.valueOf(s.charAt(i)));

            for(int j=i+1; j<stringSize; j++)
            {
                String tempChar = String.valueOf(s.charAt(j)) ;

                if(tempStr.indexOf(tempChar) == -1 )
                {
                    tempStr.append(tempChar);
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

}