class Solution {

    public static boolean find(int array[], int target)
    {
        Arrays.sort(array);
        int start = 0, end = array.length-1;

        while(start<=end)
        {
            int mid = (start+end)/2;

            if(array[mid]==target)
            {
                return true;
            }
            else if(target > array[mid])
            {
                    start = mid+1;
            }
            else if(target < array[mid])
            {
                    end = mid-1;
            }
        }
        return false;
    }

    public static int[] removeduplicates(List<Integer> ls)
    {
        List<Integer> ans = new ArrayList<>();

        for(Integer num : ls)
        {
            if(!ans.contains(num))
            {
                ans.add(num);
            }
        }

        int result[] = new int[ans.size()];
        int index = 0;
        for(Integer num : ans)
        {
            result[index++] = num;
        }
        return result;

    }

    public int[] intersection(int[] nums1, int[] nums2) 
    {
        List<Integer> ls = new ArrayList<>();
        int array1[] = nums1.length<=nums2.length?nums1:nums2;
        int array2[] = nums1.length>nums2.length?nums1:nums2;

        for(int i=0; i<array1.length; i++)
        {
            if(find(array2, array1[i]))
            {
                ls.add(array1[i]);
            }
        }
        return removeduplicates(ls);
    }
}