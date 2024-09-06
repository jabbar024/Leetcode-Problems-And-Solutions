class Solution {
    public static boolean checkWhiteOrBlack(String str)
    {
        boolean val1 = false;
        boolean val2 = false;

        if( (str.charAt(0)-96)%2 == 0)
        {
            val1 = true;
        }

        if((str.charAt(1)-'0')%2 == 0)
        {
            val2 = true;
        }

        if(val1 == val2)
        {
            return false;
        }
        return true;
       
    }
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        
        return checkWhiteOrBlack(coordinate1) == checkWhiteOrBlack(coordinate2);
    }
}