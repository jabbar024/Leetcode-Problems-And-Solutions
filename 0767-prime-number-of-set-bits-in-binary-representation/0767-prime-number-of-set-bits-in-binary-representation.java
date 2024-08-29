class Solution {

    public static boolean countSetBit(int num)
    {
        int count =0;
        while(num>0)
        {
            if((num&1)==1)
            {
                count++;
            }
            num = num>>1;
        }
        return isPrime(count);
    }

    public static boolean isPrime(int num)
    {
        int den =2;
        for(;den<num; den++)
        {
            if(num%den == 0)
            {
                return false;
            }
        }
        if(den == num)
        {
            return true;
        }
        return false;
    }


    public int countPrimeSetBits(int left, int right) {
        int count =0;

        for(int i=left; i<=right; i++)
        {
            if(countSetBit(i))
            {
                count++;
            }
        }
        return count;
    }
}