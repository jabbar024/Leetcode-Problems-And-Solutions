class Solution {
    public int getLucky(String s, int k) {
        
        int num =0;
        StringBuilder number = new StringBuilder() ;
        for(int i=0; i<s.length(); i++)
        {
            number.append((s.charAt(i)-96));
        }

        for(int i=0; i<number.length(); i++)
        {
            num+= number.charAt(i)-'0';
        }

        for(int i=0; i<k-1; i++)
        {
            int sum =0;
            for(int j=num; j>0; j/=10)
            {
                int digit = j%10;
                sum+=digit;
            }

            num = sum;
        }

        return num;
       
    }
}