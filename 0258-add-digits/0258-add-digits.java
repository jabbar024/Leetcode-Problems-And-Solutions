class Solution {
    public int addDigits(int num) {

        while(num>=10)
        {
            int n = 0;
            for(int i=num; i>0; i/=10)
            {
                int lastDigit = i%10;
                n +=lastDigit;
            }
            num = n;
        }
        return num;
    }
}