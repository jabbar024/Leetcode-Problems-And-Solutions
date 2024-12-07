class Solution {
    public static int firstIndexPosition(int[] nums, int target){
        int start = 0, end = nums.length-1, index = -1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid] == target){
                index = mid;
                end = mid-1;
            }
            else if(nums[mid]<target){
                start = mid+1;
            }else{
                end = mid -1;
            }
        }return index;
    }
    public static int seconfIndexPosition(int[] nums, int target){
        int start = 0, end = nums.length-1, index = -1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid] == target){
                index = mid;
                start = mid+1;
            }
            else if(nums[mid]<target){
                start = mid+1;
            }else{
                end = mid -1;
            }
        }
       return index;
    }

    public int[] searchRange(int[] nums, int target) {
        int[] array ={-1,-1};
        array[0] = firstIndexPosition(nums, target);
        array[1] = seconfIndexPosition(nums, target);
        return array;
    }
}