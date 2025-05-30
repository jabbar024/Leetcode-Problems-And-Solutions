class Solution 
{
    public String stringHash(String s, int k) 
    {
        String alphabate[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"} ;

        StringBuilder result = new StringBuilder();
        for(int i=0; i<s.length(); )
        {
            result.append( alphabate[getDividedString(s.substring(i, i+k))] ) ; 
            i+=k ;          
        }

        return result.toString();
        
    }

    public static int getDividedString(String str)
    {
        int num = 0 ;
        for(int i=0; i<str.length(); i++)
        {
            num += (int)((str.charAt(i))-97) ;
        }

        return num%26 ;

    }
}