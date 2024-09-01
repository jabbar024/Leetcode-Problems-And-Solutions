class Solution {
    public static String convertToHex(int num) {
        String hexArray[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};
        StringBuilder str = new StringBuilder();

        if (num == 0) {
            return hexArray[num];
        }

        // Process the number until it's 0
        while (num != 0) {
            int rem = num & 0xF;  // Get the last 4 bits
            str.insert(0, hexArray[rem]);  // Prepend the corresponding hex digit
            num >>>= 4;  // Unsigned shift by 4 bits
        }

        return str.toString();
    }

    public String toHex(int num) {
        return convertToHex(num);
    }
}
