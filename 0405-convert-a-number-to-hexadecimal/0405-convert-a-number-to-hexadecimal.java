class Solution {
    public String toHex(int num) {

        String hexArray[] = {"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};
        String str = "";

        if(num==0)
        {
            return hexArray[num];
        }

        while(num!=0)
        {
            int rem = num & 0xF;
            str = hexArray[rem] + str;
            num = num>>>4;
        }
        return str;

    }
}