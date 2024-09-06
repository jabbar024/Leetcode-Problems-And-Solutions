class Solution {
    public boolean isHappy(int n) {
        
        while(n != 4 )
        {
            int num = 0;
            for(int i=n; i>0; i/=10)
            {
                int last = i%10;
                num += Math.pow(last, 2);
                
            }
            
            n = num;

            if(n == 1)
            {
                return true;
            }
        }

        return false;
        
    }
}