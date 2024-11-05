class Solution {
    public boolean rotateString(String s, String goal) {
        String ss = s+s;
        int start = 0;
        int end = s.length();
        while(end<ss.length()){
            if((ss.substring(start, end)).equals(goal)){
                return true;
            }
            start++;
            end++;
        }
        return false;
    }
}