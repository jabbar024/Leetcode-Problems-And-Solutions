class Solution {
    public static boolean isPalindrome(char[] ch, int start, int end)
    {
        while(start<end)
        {
            if(ch[start]!=ch[end])
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public String longestPalindrome(String s) 
    {
        char[] ch = s.toCharArray(); 

        int max =0;
        int start=0, end =0;

        for(int i=0; i<ch.length; i++)
        {
            for(int j=ch.length-1; j>=0; j--)
            {
                if( (ch[i]==ch[j]) && (isPalindrome(ch, i,j)) && (max < ((j-i)+1)) )
                {
                        max=(j-i)+1;
                        start=i; end=j;
                }
            }
        }
        return s.substring(start, end+1) ;
    }
    
}