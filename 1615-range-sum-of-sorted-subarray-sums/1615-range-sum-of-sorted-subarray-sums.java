class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {

        int array[] = new int[n*(n+1)/2];
        int index = 0;
        for(int i=0; i<nums.length; i++){
            int sum = 0;
            for(int j=i; j<nums.length; j++){
                sum += nums[j];
                array[index] = sum;
                index++; 
            }
        }

        Arrays.sort(array);

        int result =0;
        for(int i=left-1; i<right; i++){
            result = (result + array[i])%1000000007;
        }
        return result;
    }
}