class Solution {
    public String multiply(String num1, String num2) {

        
        if(num1.equals("0") || num2.equals("0"))
        {
            return "0";
        }


        int l1 = num1.length();
        int l2 = num2.length();

        int resultArray[] = new int[l1+l2];

        int powerFactor = 0;
        for(int i=num2.length()-1; i>=0; i--)
        {
            int iValue = num2.charAt(i)-'0';
            int carry = 0;
            int k = resultArray.length-1-powerFactor;

            for(int j= num1.length()-1; j>=0 || carry!=0; j--)
            {
                int jValue = j>=0 ? num1.charAt(j)-'0' : 0;

                int product = (iValue*jValue)+carry + resultArray[k];
                resultArray[k] = product%10;
                carry = product/10;
                k--;
            }
            powerFactor++;
        }

        String str="";
        boolean bl = false;
        for(int i=0; i<resultArray.length; i++)
        {
            if(resultArray[i]==0 && bl == false)
            {
                continue;
            }
            else
            {
                bl = true;
                str += resultArray[i];
            }
        }

        return str;
        
    }
}