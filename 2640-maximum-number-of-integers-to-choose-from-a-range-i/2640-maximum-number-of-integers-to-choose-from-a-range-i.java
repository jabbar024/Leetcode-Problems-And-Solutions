class Solution {

    public static boolean isPresent(int[] array, int target)
    {
        int start = 0, end = array.length-1;

        while(start<=end)
        {
             int mid = (start+end)/2;

             if(target == array[mid])
             {
                return true;
             }
             else if(target < array[mid])
             {
                end = mid-1;
             }
             else
             {
                start = mid+1;
             }
        }   
        return false;
    }


    public int maxCount(int[] banned, int n, int maxSum) 
    {
        Arrays.sort(banned);

        int ans = 0;
        int sum = 0;
        for(int i=1; i<=n; i++)
        {
            if(!isPresent(banned, i) && (sum+i)<=maxSum)
            {
                ans++;
                sum += i;
            }
        }
        return ans;
    }
}