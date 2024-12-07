class Solution 
{
     private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public String gcdOfStrings(String str1, String str2) 
    {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Find the GCD of the lengths of the two strings
        int gcdLength = gcd(str1.length(), str2.length());
        
        // The largest string `x` that divides both strings is the prefix of length gcdLength
        return str1.substring(0, gcdLength);
    }
}