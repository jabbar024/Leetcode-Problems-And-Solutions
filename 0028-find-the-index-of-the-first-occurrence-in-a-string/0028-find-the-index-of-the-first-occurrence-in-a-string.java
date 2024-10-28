class Solution {
    public int strStr(String haystack, String needle) {
        int haystackLength = haystack.length();
        int needleLength = needle.length();

        if (haystack.contains(needle)) {
            for (int i = 0; i <= haystackLength - needleLength; i++) {
                if ((haystack.substring(i, i + needleLength)).equals(needle)) {
                    return i;
                }
            }
        }

        return -1;
    }
}