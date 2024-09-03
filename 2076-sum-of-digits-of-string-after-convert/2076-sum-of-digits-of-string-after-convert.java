class Solution {
    public int getLucky(String s, int k) {
        
        int num =0;
        String number = "";
        for(int i=0; i<s.length(); i++)
        {
            number = number+ (s.charAt(i)-96);
        }

        for(int i=0; i<number.length(); i++)
        {
            num+= number.charAt(i)-'0';
        }
        k--;

        while(k!=0)
        {
            int sum =0;
            for(int j=num; j>0; j/=10)
            {
                int digit = j%10;
                sum+=digit;
            }
            k--;
            num = sum;
        }

        return num;
       
    }
}