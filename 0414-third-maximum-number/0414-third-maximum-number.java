class Solution {
    public static int thirdMax(int[] nums) {
        // Use a set to track distinct numbers
        Set<Integer> distinctNumbers = new HashSet<>();
        
        // Sort the array in descending order
        Arrays.sort(nums);
        
        // Traverse the array in reverse order to find distinct maximums
        for (int i = nums.length - 1; i >= 0; i--) {
            distinctNumbers.add(nums[i]);
            // Once we have found 3 distinct numbers, return the third one
            if (distinctNumbers.size() == 3) {
                return nums[i];
            }
        }
        
        // If there are fewer than 3 distinct numbers, return the maximum number
        return Collections.max(distinctNumbers);
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 1};
        System.out.println("Third maximum number is: " + thirdMax(nums));  // Output: 1
        
        int[] nums2 = {1, 2};
        System.out.println("Third maximum number is: " + thirdMax(nums2));  // Output: 2
    }
}