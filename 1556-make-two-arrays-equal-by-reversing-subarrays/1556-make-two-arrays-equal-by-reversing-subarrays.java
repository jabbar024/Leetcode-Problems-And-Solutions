class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        String str = Arrays.toString(target);
        String str2 = Arrays.toString(arr);

        if(str.contains(str2)){
            return true;
        }
        return false;
    }
}