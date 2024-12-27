class Solution {
    public int[][] divideArray(int[] nums, int k) 
    {
        Arrays.sort(nums);
        int [][] array = new int[nums.length/3][3];

        int index = 0;

        for(int i=0; i<array.length; i++)
        {
            int num1 = nums[index++];
            int num2 = nums[index++];
            int num3 = nums[index++];

            if( (num3-num1)<=k)
            {
                array[i][0] = num1;
                array[i][1] = num2;
                array[i][2] = num3;
            }
            else
            {
                return new int[][]{};
            }
        }
        return array;  
    }
}