class Solution {

    public static int countSetBit(int num)
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
        return count;
    }

   
    public int countPrimeSetBits(int left, int right) {
        int prime = 665772;
        int count =0;

        for(int i=left; i<=right; i++)
        {
            if(((prime>>countSetBit(i))&1) == 1)
            {
                count++;
            }
        }
        return count;
    }
}