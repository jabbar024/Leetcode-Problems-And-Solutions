class Solution {
    public String convert(String s, int numRows) 
    {
         if (numRows == 1 || numRows >= s.length()) 
         {
            return s;
        }
        String [] array = new String[numRows];
        String ans = "";
        for(int i=0; i<numRows; i++)
        {
            array[i] = "";
        }

        for(int i=0; i<s.length(); )
        {
            for(int j=0; j<numRows; j++)
            {
                if(i==s.length())
                {
                    break;
                }
                array[j] += s.charAt(i);
                i++;
                
            }

            for(int j=numRows-2; j>=1; j--)
            {
                if(i==s.length())
                {
                    break;
                }
                array[j] += s.charAt(i);
                i++;
                
            }
        }

        for(int i=0; i<array.length; i++)
        {
            ans+=array[i];
        }

        return ans;

    }
}