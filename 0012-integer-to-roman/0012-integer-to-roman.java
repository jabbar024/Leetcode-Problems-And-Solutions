class Solution {

    public static String[] str = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
    public static int [] array = {1,     4,   5,   9,    10,  40,   50,  90,  100,  400, 500,  900,  1000};

    public static int  getRoman(int num)
    {
        for(int i=0; i<array.length; i++)
        {
            if(num==array[i])
            {
                return i;
            }
            else if(num<array[i])
            {
                return i-1;
            }
             else if(i==array.length-1)
            {
                return i;
            }
        }
        
        return 0;
    }

    public String intToRoman(int num) 
    {
        String ans = "";
        int mod = 1;

        while(num>0)
        {
            mod = mod*10;
            int last = num%mod;

            if( last!=0 && (last-array[getRoman(last)])==0)
            {
                ans = str[getRoman(last)]+ans;
            }
            else
            {
                String temp = "";
                for(int i=last; i>0; )
                {
                    int index = getRoman(i);
                    temp = temp+str[index];
                    i = i-array[index];
                } 
               ans = temp+ans;
            }
            
            num = num-last;

        }
        return ans;
    }
}