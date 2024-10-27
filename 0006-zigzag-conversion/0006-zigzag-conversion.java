class Solution {
    public String convert(String s, int numRows) 
    {
         if (numRows == 1 || numRows >= s.length()) 
         {
            return s;
        }

        StringBuilder [] array = new StringBuilder[numRows];

        for(int i=0; i<array.length; i++)
        {
            array[i] = new StringBuilder();
        }

        for(int i=0; i<s.length(); )
        {
            for(int j=0; j<numRows; j++)
            {
                if(i==s.length())
                {
                    break;
                }
                array[j].append(s.charAt(i));
                i++;
                
            }

            for(int j=numRows-2; j>=1; j--)
            {
                if(i==s.length())
                {
                    break;
                }
                array[j].append(s.charAt(i));
                i++;
                
            }
        }

        StringBuilder  ans = new StringBuilder();
        for(int i=0; i<array.length; i++)
        {
            ans.append(array[i]);
        }

        return ans.toString();

    }
}