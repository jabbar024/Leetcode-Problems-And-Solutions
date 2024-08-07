class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int index =0;

        int resultArray[]= new int[2];

        for(int i=0; i<nums.length; i++){
            if(i == nums.length-1 && (nums[i]^nums[i-1]) != 0){
                resultArray[index] = nums[i];
            }
            else if((nums[i]^nums[i+1]) != 0){
                resultArray[index++] = nums[i];
            }else {
                i++;
            }
        } 

        
        return resultArray;
    }
}