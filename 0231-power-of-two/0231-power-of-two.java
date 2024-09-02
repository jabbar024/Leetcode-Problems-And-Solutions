class Solution {
    public boolean isPowerOfTwo(int n) {

        int power = 0;

        while(true)
        {
            double powerOfTwo = Math.pow(2, power);
            if(powerOfTwo == n)
            {
                return true;
            }
            else if(powerOfTwo>n)
            {
                break;
            }
            power++;
        }
        return false;
        
    }
}