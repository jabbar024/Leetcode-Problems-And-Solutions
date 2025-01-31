class Solution {

    public boolean checkCharacter(String s, String[] strs)
    {
        for(int i=1; i<strs.length; i++)
        {
            if(!(strs[i].startsWith(s)))
            {
                return false ;
            }
        }

        return true ;
    }

    public String longestCommonPrefix(String[] strs)
    {
        String firstLatter= strs[0] ;
        String result = "" ;

        for(int i=0; i<firstLatter.length(); i++)
        {
            if(!checkCharacter(firstLatter.substring(0,i+1), strs))
            {
                return result ;
            }
            result = firstLatter.substring(0,i+1) ;
        }
        return result ;
    }
}