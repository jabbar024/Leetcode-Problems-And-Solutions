class Solution {
    public boolean isPossibleToSplit(int[] nums) 
    {
        int max = Integer.MIN_VALUE; 
        for(int i=0; i<nums.length; i++)
        {
            max = Math.max(nums[i], max);
        }      

        int[] countArray  = new int[max+1];

        for(int i=0; i<nums.length; i++)
        {   
            countArray[nums[i]]++;
        } 

        for(int i=0; i<countArray.length; i++)
        {
            if(countArray[i]>2)
            {
                return false;
            }
        }
        return true;
    }
}