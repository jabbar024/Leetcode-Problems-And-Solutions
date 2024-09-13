class Solution {
    public static boolean checkContain(String allowed, String str)
    {
        for(int i=0; i<str.length(); i++)
        {
            if(!allowed.contains(String.valueOf(str.charAt(i))))
            {
                return false;
            }
        }
        return true;
    }
    public int countConsistentStrings(String allowed, String[] words) 
    {
        int count = 0;
        for(int i=0; i< words.length; i++)
        {
            if(checkContain(allowed, words[i]))
            {
                count++;
            }
        }
        return count;
    }
}