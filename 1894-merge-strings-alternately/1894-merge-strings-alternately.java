class Solution {
    public String mergeAlternately(String word1, String word2) 
    {
        StringBuilder sb = new StringBuilder();
        int i=0;
        int length1 = word1.length();
        int length2 = word2.length();
        for(; i<length1 && i<length2; i++)
        {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }

        if(length1>length2)
        {
            for(; i<length1; i++)
            {
                sb.append(word1.charAt(i));
            }
        }
        else
        {
            for(; i<length2; i++)
            {
                sb.append(word2.charAt(i));
            }
        }
        return sb.toString();
    }
}