class Solution {
    public static int compress(char[] str) {
        StringBuilder sb = new StringBuilder();

        int count=0;
        for(int i=0; i < str.length; i+=count )
        {
            count = 0;
            for(int j=i; j<str.length; j++)
            {
                if(str[i] == str[j])
                {
                    count++;
                }
                else
                {
                    break;
                }
            }
            sb.append(str[i]);
            if(count>1)
            {
                sb.append(count);
            }
           
        }
        String compressedstr = sb.toString();
        char[] compressedChar = compressedstr.toCharArray();
        for(int i=0 ; i<compressedChar.length; i++)
        {
            str[i] = compressedChar[i];
        }
        return compressedChar.length;
    }

}