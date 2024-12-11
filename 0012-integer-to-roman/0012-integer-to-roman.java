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
        StringBuilder ans = new StringBuilder();
        int mod = 1;

        while(num>0)
        {
            mod = mod*10;
            int last = num%mod;
            int index1 = getRoman(last);

            if( last!=0 && (last-array[index1])==0)
            {
                ans.insert(0, str[index1]);
            }
            else
            {
                StringBuilder temp = new StringBuilder();
                for(int i=last; i>0; )
                {
                    int index = getRoman(i);
                    temp.append(str[index]);
                    i = i-array[index];
                } 
               ans.insert(0, temp);
            }
            
            num = num-last;

        }
        return new String(ans);
    }
}