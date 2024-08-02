class Solution {

    public static int countSetBit (int num){
        int count =0;
        while(num>0){
            if((num&1) == 1){
                count++;
            }
            num = num>>1;
        }
        return count;

    }
    public int[] countBits(int n) {

        int[] ans = new int[n+1];

        ans[0] = 0;
        for(int i=1; i<ans.length; i++){
            ans[i] = countSetBit(i);
        }
        return ans;
    }
    
}